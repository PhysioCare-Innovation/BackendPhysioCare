package com.physiocare.backend.treatments.api.rest;

import com.physiocare.backend.profile.domain.service.PatientService;
import com.physiocare.backend.treatments.domain.service.TreatmentPatientService;
import com.physiocare.backend.treatments.mapping.TreatmentPatientMapper;
import com.physiocare.backend.treatments.resource.CreateTreatmentPatientResource;
import com.physiocare.backend.treatments.resource.TreatmentPatientResource;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/patients/{patientId}/treatments_by_patient", produces = "application/json")
@Tag(name = "Patients TreatmentsPatients", description = "Create, read, update and delete treatments")
public class PatientTreatmentsPatientController {

    private final PatientService patientService;

    private final TreatmentPatientService treatmentPatientService;

    private final TreatmentPatientMapper mapper;

    public PatientTreatmentsPatientController(PatientService patientService, TreatmentPatientService treatmentPatientService, TreatmentPatientMapper mapper) {
        this.patientService = patientService;
        this.treatmentPatientService = treatmentPatientService;
        this.mapper = mapper;
    }

    @GetMapping
    public Page<TreatmentPatientResource> getAllTreatmentsPatientByPatientId(@PathVariable Long patientId,
                                                                               Pageable pageable) {
        return mapper.modelListPage(patientService.getById(patientId)
                .getTreatments().stream().toList(), pageable);
    }

    @PostMapping
    public TreatmentPatientResource createTreatmentPatient(@PathVariable Long treatmentId,
                                                           @RequestBody CreateTreatmentPatientResource resource) {

        patientService.addTreatmentToPatient(treatmentId, resource.getRegistrationDate(), resource.getProgress());
        return mapper.toResource(treatmentPatientService
                .getById(treatmentId));
    }


}

package com.physiocare.backend.treatments.resource;

import com.physiocare.backend.profile.resource.PatientResource;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateTreatmentPatientResource {

    private TreatmentResource treatment;
    private PatientResource patient;

    @NotNull
    @NotBlank
    private Date registrationDate;

    private Double progress;
}

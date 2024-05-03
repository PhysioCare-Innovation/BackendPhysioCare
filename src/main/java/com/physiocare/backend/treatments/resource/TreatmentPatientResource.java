package com.physiocare.backend.treatments.resource;

import com.physiocare.backend.profile.resource.PatientResource;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class TreatmentPatientResource {

    private Long id;
    private TreatmentResource treatment;
    private PatientResource patient;
    private Date registrationDate;
    private Double progress;

}

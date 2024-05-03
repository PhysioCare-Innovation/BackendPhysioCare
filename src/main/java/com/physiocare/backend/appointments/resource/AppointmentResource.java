package com.physiocare.backend.appointments.resource;

import com.physiocare.backend.profile.resource.PatientResource;
import com.physiocare.backend.profile.resource.PhysiotherapistResource;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentResource {
    
    private Long id;
    private String scheduledDate;
    private String topic;
    private String diagnosis;
    private String done;
    private PatientResource patient;
    private PhysiotherapistResource physiotherapist;
    
}

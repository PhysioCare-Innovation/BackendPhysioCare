package com.physiocare.backend.social.resource;

import com.physiocare.backend.profile.resource.PatientResource;
import com.physiocare.backend.profile.resource.PhysiotherapistResource;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class ReviewResource {
    
    private Long id;
    private String description;
    private Long stars;
    
    private PatientResource patient;
    private PhysiotherapistResource physiotherapist;
    
}

package com.physiocare.backend.treatments.resource;

import com.physiocare.backend.profile.resource.PhysiotherapistResource;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class TreatmentResource {

    private Long id;
    private String title;
    private String description;
    private String photoUrl;
    private int sessionsQuantity;
    private PhysiotherapistResource physiotherapist;
}
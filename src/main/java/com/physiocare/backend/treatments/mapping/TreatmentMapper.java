package com.physiocare.backend.treatments.mapping;

import com.physiocare.backend.shared.mapping.EnhancedModelMapper;
import com.physiocare.backend.treatments.domain.model.entity.Treatment;
import com.physiocare.backend.treatments.resource.CreateTreatmentResource;
import com.physiocare.backend.treatments.resource.TreatmentResource;
import com.physiocare.backend.treatments.resource.UpdateTreatmentResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class TreatmentMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public TreatmentResource toResource(Treatment model) {
        return mapper.map(model, TreatmentResource.class);
    }

    public Treatment toModel(CreateTreatmentResource resource) {
        return mapper.map(resource, Treatment.class);
    }

    public Treatment toModel(UpdateTreatmentResource resource) {return mapper.map(resource, Treatment.class);}

    public Page<TreatmentResource> modelListPage(List<Treatment> modelList, Pageable pageable) {
        return new PageImpl<>(mapper.mapList(modelList, TreatmentResource.class), pageable, modelList.size());
    }
}
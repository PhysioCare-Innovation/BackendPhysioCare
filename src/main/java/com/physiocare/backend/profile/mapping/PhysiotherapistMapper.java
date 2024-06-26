package com.physiocare.backend.profile.mapping;

import com.physiocare.backend.profile.domain.model.entity.Physiotherapist;
import com.physiocare.backend.profile.resource.CreatePhysiotherapistResource;
import com.physiocare.backend.profile.resource.PhysiotherapistResource;
import com.physiocare.backend.profile.resource.UpdatePhysiotherapistResource;
import com.physiocare.backend.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class PhysiotherapistMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public PhysiotherapistResource toResource(Physiotherapist model) {
        return mapper.map(model, PhysiotherapistResource.class);
    }

    public Physiotherapist toModel(CreatePhysiotherapistResource resource) {
        return mapper.map(resource, Physiotherapist.class);
    }

    public Physiotherapist toModel(UpdatePhysiotherapistResource resource) { return mapper.map(resource, Physiotherapist.class);}

    public Page<PhysiotherapistResource> modelListPage(List<Physiotherapist> modelList, Pageable pageable) {
        return new PageImpl<>(mapper.mapList(modelList, PhysiotherapistResource.class), pageable, modelList.size());
    }
}
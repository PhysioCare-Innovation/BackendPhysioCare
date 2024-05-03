package com.physiocare.backend.appointments.mapping;

import com.physiocare.backend.appointments.domain.model.entity.Appointment;
import com.physiocare.backend.appointments.resource.AppointmentResource;
import com.physiocare.backend.appointments.resource.CreateAppointmentResource;
import com.physiocare.backend.appointments.resource.UpdateAppointmentResource;
import com.physiocare.backend.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class AppointmentMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public AppointmentResource toResource(Appointment model) {
        return mapper.map(model, AppointmentResource.class);
    }

    public Appointment toModel(CreateAppointmentResource resource) {
        return mapper.map(resource, Appointment.class);
    }

    public Appointment toModel(UpdateAppointmentResource resource) {return mapper.map(resource, Appointment.class);}
    public Page<AppointmentResource> modelListPage(List<Appointment> modelList, Pageable pageable) {
        return new PageImpl<>(mapper.mapList(modelList, AppointmentResource.class), pageable, modelList.size());
    }
}
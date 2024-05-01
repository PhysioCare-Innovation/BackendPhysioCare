package com.theraphy.backend.profile.domain.persistence;

import com.theraphy.backend.profile.domain.model.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
    
    Patient findByFirstName(String firstName);
    
    Optional<Patient> findByUserId(Long userId);
    
}

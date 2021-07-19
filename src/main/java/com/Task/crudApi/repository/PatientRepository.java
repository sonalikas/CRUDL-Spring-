package com.Task.crudApi.repository;

import com.Task.crudApi.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Integer> {

    Patient findByName(String name);
}

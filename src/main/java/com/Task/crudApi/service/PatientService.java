package com.Task.crudApi.service;

import com.Task.crudApi.entity.Patient;
import com.Task.crudApi.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository repository;
//    save methods
    public Patient savePatient(Patient patient){

        return repository.save(patient);
    }
    public List<Patient> savePatient(List<Patient> patient)
    {
        return repository.saveAll(patient);
    }
// get methods
    public List<Patient> getPatient(){

        return repository.findAll();
    }
    public Patient getPatientById(int id){

        return repository.findById(id).orElse(null);
    }
    public Patient getPatientByName(String name){

        return repository.findByName(name);
    }
//  delete method
    public String deletePatient(int id){
        repository.deleteById(id);
        return "Patient info deleted !! "+ id;
    }
//    update method
    public Patient updatePatient(Patient patient){
        Patient existingPatient=repository.findById(patient.getId()).orElse(null);
        existingPatient.setName(patient.getName());
        existingPatient.setStatus(patient.getStatus());
        existingPatient.setDescription((patient.getDescription()));
        return repository.save(existingPatient);
    }


}

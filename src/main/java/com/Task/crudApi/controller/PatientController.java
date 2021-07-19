package com.Task.crudApi.controller;

import com.Task.crudApi.entity.Patient;
import com.Task.crudApi.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService service;
    // POST
    @PostMapping("/patient")
    public Patient addPatient(@RequestBody Patient patient){
        return service.savePatient(patient);
    }
    @PostMapping("/patients")
    public List<Patient> addPatients(@RequestBody List<Patient> patient){
        return service.savePatient(patient);
    }
//    GET
    @GetMapping("/patients")
    public List<Patient> findAllPatient(){
        return service.getPatient();
    }
    @GetMapping("/patientById/{id}")
    public Patient findPatientById(@PathVariable int id){
        return service.getPatientById(id);
    }
    @GetMapping("/patient/{name}")
    public Patient findPatientByName(@PathVariable String name){
        return service.getPatientByName(name);
    }
//    PUT
    @PutMapping("/patient")
    public Patient updatePatient(@RequestBody Patient patient){
        return service.updatePatient(patient);
    }
//    DELETE

@DeleteMapping("/patient/{id}")
    public String deletePatient(@PathVariable int id) {
        return service.deletePatient(id);
    }
}

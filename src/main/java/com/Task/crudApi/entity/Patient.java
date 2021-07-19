package com.Task.crudApi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PATIENT_info")

public class Patient {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String status;
    private String description;
}



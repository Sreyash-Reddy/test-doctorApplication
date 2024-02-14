package com.doctorappointmentapp.doctorapplicationmicroservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Doctor {

    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private Boolean isAvailable;


}

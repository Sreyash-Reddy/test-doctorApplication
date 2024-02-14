package com.doctorappointmentapp.doctorapplicationmicroservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Doctor {
    @Id
    private Long id;


}

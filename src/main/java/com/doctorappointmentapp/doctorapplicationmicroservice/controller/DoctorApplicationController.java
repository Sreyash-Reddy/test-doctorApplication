package com.doctorappointmentapp.doctorapplicationmicroservice.controller;

import com.doctorappointmentapp.doctorapplicationmicroservice.entities.Doctor;
import com.doctorappointmentapp.doctorapplicationmicroservice.service.DoctorApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorApplicationController {

    @Autowired
    private DoctorApplicationService doctorApplicationService;

    @PostMapping("login/doctor")
    public Boolean loginDoctor(@RequestBody String Username){
        return true;
    }
}

package com.doctorappointmentapp.doctorapplicationmicroservice.controller;

import com.doctorappointmentapp.doctorapplicationmicroservice.service.DoctorApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorApplicationController {

    @Autowired
    private DoctorApplicationService doctorApplicationService;



}

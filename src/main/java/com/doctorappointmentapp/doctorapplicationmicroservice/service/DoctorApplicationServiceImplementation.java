package com.doctorappointmentapp.doctorapplicationmicroservice.service;

import com.doctorappointmentapp.doctorapplicationmicroservice.dataaccesslogic.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorApplicationServiceImplementation implements DoctorApplicationService{

    @Autowired
    private DoctorRepository doctorRepository;

}

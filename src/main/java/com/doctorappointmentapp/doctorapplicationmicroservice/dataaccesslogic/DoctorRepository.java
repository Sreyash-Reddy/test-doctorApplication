package com.doctorappointmentapp.doctorapplicationmicroservice.dataaccesslogic;

import com.doctorappointmentapp.doctorapplicationmicroservice.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {

}

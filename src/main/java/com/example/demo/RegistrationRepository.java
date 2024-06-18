package com.example.demo;

//import com.u2opiamobile.verificationservice.model.Register;
import com.u2opiamobile.verificationservice.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Register, Long> {

}

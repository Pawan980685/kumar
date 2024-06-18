package com.example.demo;

//import com.u2opiamobile.verificationservice.dto.RegisterDto;

import com.u2opiamobile.verificationservice.dto.RequestRegisterDto;
import com.u2opiamobile.verificationservice.dto.ResponeRegisterDto;
import com.u2opiamobile.verificationservice.entity.Country;
import com.u2opiamobile.verificationservice.entity.Register;
import com.u2opiamobile.verificationservice.model.DataResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RegistrationService  {
   public DataResponse<ResponeRegisterDto> save(RequestRegisterDto register);

   public Page<Country> getAllContries(Pageable pageable);




}

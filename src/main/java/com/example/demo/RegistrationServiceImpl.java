package com.example.demo;

//import com.u2opiamobile.verificationservice.dto.RegisterDto;
import com.u2opiamobile.verificationservice.dto.RequestRegisterDto;
import com.u2opiamobile.verificationservice.dto.ResponeRegisterDto;
import com.u2opiamobile.verificationservice.entity.Country;
import com.u2opiamobile.verificationservice.entity.Register;
//import com.u2opiamobile.verificationservice.model.Register;
import com.u2opiamobile.verificationservice.model.DataResponse;
import com.u2opiamobile.verificationservice.repository.CountryRepository;
import com.u2opiamobile.verificationservice.repository.RegistrationRepository;
import com.u2opiamobile.verificationservice.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;
    @Autowired
    private CountryRepository countryRepository;

    @Override
    public DataResponse<ResponeRegisterDto> save(RequestRegisterDto requestRegisterDto) {
        Register register=new Register();
        register.setCompanyName(requestRegisterDto.getCompanyName());
        register.setName(requestRegisterDto.getName());
        register.setWorkingEmail(requestRegisterDto.getWorkingEmail());
        register.setContactNumber(requestRegisterDto.getContactNumber());
        register.setName(requestRegisterDto.getName());
        register.setCountryToSendSMS(requestRegisterDto.getCountryToSendSMS());
        register.setCreatedDateTime(requestRegisterDto.getCreatedDateTime());
        register.setHasIndianRegisteredSenderID(register.isHasIndianRegisteredSenderID());
        register.setUsageDescription(requestRegisterDto.getUsageDescription());
        register = registrationRepository.save(register);
        DataResponse dataResponse = new DataResponse();
        dataResponse.setData(requestRegisterDto);
        dataResponse.setResponseCode(200);
        dataResponse.setData(requestRegisterDto);
        return dataResponse;
    }

    @Override
    public Page<Country> getAllContries(Pageable pageable) {
        Page<Country> country= countryRepository.findAll(pageable);
        return country;
    }



}



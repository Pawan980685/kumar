package com.example.demo;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "register")
public class Register<R> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "companyWebsite")
    private String companyWebsite;

    @Column(name = "workingEmail")
    private String workingEmail;

    @Column(name = "contactNumber")
    private String contactNumber;

    @Column(name = "countryToSendSms")
    private String countryToSendSMS;

    @Column(name = "IndianRegisteredSenderId")
    private boolean hasIndianRegisteredSenderID;


    @Column(name = "UsageDescription")
    private String usageDescription;


    @Column(name = "UserAccountType")
    private String userAccountType;

    @Column(name = "createdDateTime")
    private LocalDateTime createdDateTime;

    @Column(name = "updatedDateTime")
    private LocalDateTime updatedDateTime;

    // Getters and setters
}


package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponeRegisterDto {

    private String name;

    private String companyName;

    private String companyWebsite;

    private String workingEmail;

    private String contactNumber;
}

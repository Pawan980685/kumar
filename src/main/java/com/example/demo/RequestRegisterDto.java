package com.example.demo;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestRegisterDto {

    private String name;

    private String companyName;

    private String companyWebsite;

    private String workingEmail;

    private String contactNumber;

    private String countryToSendSMS;

    private boolean hasIndianRegisteredSenderID;

    private String usageDescription;

    private String userAccountType;

    private LocalDateTime createdDateTime;

    private LocalDateTime updatedDateTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	public String getWorkingEmail() {
		return workingEmail;
	}

	public void setWorkingEmail(String workingEmail) {
		this.workingEmail = workingEmail;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCountryToSendSMS() {
		return countryToSendSMS;
	}

	public void setCountryToSendSMS(String countryToSendSMS) {
		this.countryToSendSMS = countryToSendSMS;
	}

	public boolean isHasIndianRegisteredSenderID() {
		return hasIndianRegisteredSenderID;
	}

	public void setHasIndianRegisteredSenderID(boolean hasIndianRegisteredSenderID) {
		this.hasIndianRegisteredSenderID = hasIndianRegisteredSenderID;
	}

	public String getUsageDescription() {
		return usageDescription;
	}

	public void setUsageDescription(String usageDescription) {
		this.usageDescription = usageDescription;
	}

	public String getUserAccountType() {
		return userAccountType;
	}

	public void setUserAccountType(String userAccountType) {
		this.userAccountType = userAccountType;
	}

	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public LocalDateTime getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public RequestRegisterDto(String name, String companyName, String companyWebsite, String workingEmail,
			String contactNumber, String countryToSendSMS, boolean hasIndianRegisteredSenderID, String usageDescription,
			String userAccountType, LocalDateTime createdDateTime, LocalDateTime updatedDateTime) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.companyWebsite = companyWebsite;
		this.workingEmail = workingEmail;
		this.contactNumber = contactNumber;
		this.countryToSendSMS = countryToSendSMS;
		this.hasIndianRegisteredSenderID = hasIndianRegisteredSenderID;
		this.usageDescription = usageDescription;
		this.userAccountType = userAccountType;
		this.createdDateTime = createdDateTime;
		this.updatedDateTime = updatedDateTime;
	}

	@Override
	public String toString() {
		return "RequestRegisterDto [name=" + name + ", companyName=" + companyName + ", companyWebsite="
				+ companyWebsite + ", workingEmail=" + workingEmail + ", contactNumber=" + contactNumber
				+ ", countryToSendSMS=" + countryToSendSMS + ", hasIndianRegisteredSenderID="
				+ hasIndianRegisteredSenderID + ", usageDescription=" + usageDescription + ", userAccountType="
				+ userAccountType + ", createdDateTime=" + createdDateTime + ", updatedDateTime=" + updatedDateTime
				+ "]";
	}
    
    
}

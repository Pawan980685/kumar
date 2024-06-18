package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="country")
public class Country {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "dialingCode",unique = true,nullable = false)
	String phoneCode;      //91
	@Column(name = "countryCode",unique = true,nullable = false)
	String isoCountryCode; //IN
	@Column(name = "countryName")
	String name;
	@Column(name = "phoneNumberMinLength")
	Integer minLength;
	@Column(name = "phoneNumberMaxLength")
	Integer maxLength;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPhoneCode() {
		return phoneCode;
	}
	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}
	
	public String getIsoCountryCode() {
		return isoCountryCode;
	}
	public void setIsoCountryCode(String isoCountryCode) {
		this.isoCountryCode = isoCountryCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMinLength() {
		return minLength;
	}
	public void setMinLength(Integer minLength) {
		this.minLength = minLength;
	}
	public Integer getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", phoneCode=" + phoneCode + ", isoCountryCode=" + isoCountryCode + ", name=" + name + ", minLength="
				+ minLength + ", maxLength=" + maxLength + "]";
	}
	
}

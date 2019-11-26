package com.example.cdgallery.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class CustomerDto {

	
	public CustomerDto(int customerId, String password) {
		super();
		this.customerId = customerId;
		this.password = password;
	}


	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	private int customerId;
	private String password;
	private String firstName;
	private String secondName;

	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	private String address;
	private int contactNo;
	private int creditCardNo;
	private String creditCardType;
	
	@Temporal(TemporalType.DATE)
	private Date cardExpiryDate;

	
	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getSecondName() {
		return secondName;
	}


	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getContactNo() {
		return contactNo;
	}


	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}


	public int getCreditCardNo() {
		return creditCardNo;
	}


	public void setCreditCardNo(int creditCardNo) {
		this.creditCardNo = creditCardNo;
	}


	public String getCreditCardType() {
		return creditCardType;
	}


	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}


	public Date getCardExpiryDate() {
		return cardExpiryDate;
	}


	public void setCardExpiryDate(Date cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}


	

	
	
	
	
	
	
}

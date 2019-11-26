package com.example.cdgallery.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@SequenceGenerator(name="customerid", initialValue=1, allocationSize=1)
public class Customer {

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customerid")
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

	public int getCustomerid() {
		return customerId;
	}

	public void setCustomerid(int customerid) {
		this.customerId = customerid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	public String getSecondname() {
		return secondName;
	}

	public void setSecondname(String secondname) {
		this.secondName = secondname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getContactno() {
		return contactNo;
	}

	public void setContactno(int contactno) {
		this.contactNo = contactno;
	}

	public int getCreditcardno() {
		return creditCardNo;
	}

	public void setCreditcardno(int creditcardno) {
		this.creditCardNo = creditcardno;
	}

	public String getCreditcardtype() {
		return creditCardType;
	}

	public void setCreditcardtype(String creditcardtype) {
		this.creditCardType = creditcardtype;
	}

	public Date getDateofbirth() {
		return dateOfBirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateOfBirth = dateofbirth;
	}

	public Date getCardexpirydate() {
		return cardExpiryDate;
	}

	public void setCardexpirydate(Date cardexpirydate) {
		this.cardExpiryDate = cardexpirydate;
	}

	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy ="customer",fetch = FetchType.LAZY)
    private Set<RentalDetails> rentalDetails;
	
	
	
	
	
	
	
}

package com.example.cdgallery.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="rentaldetails")
@SequenceGenerator(name="hire_id", initialValue=1, allocationSize=1)
public class RentalDetails {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="hire_id")
	private int hireId;
   
	private int customerid;
	private int albumId;
	
	@Temporal(TemporalType.DATE)
	private Date hireDate;
	@Temporal(TemporalType.DATE)
	private Date returnDate;
	private String status;
	public int getHireId() {
		return hireId;
	}
	public void setHireId(int hireId) {
		this.hireId = hireId;
	}
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	   @JoinColumn(name = "albumId", nullable = false, insertable = false, updatable = false)
	      @JsonIgnore
	    private AlbumDetails albumDetails;

	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	   @JoinColumn(name = "customerid", nullable = false, insertable = false, updatable = false)
	      @JsonIgnore
	    private Customer customer;
	
	
}

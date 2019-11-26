package com.example.cdgallery.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class RentalDetailsDto {

	
	private int hireId;
private int customerid;
	private List<Integer> albumidlist;
	private int albumId;
	private List<Integer> hireidlist;
	
	private Date hireDate;
	
	private Date returnDate;
	private String status;
	public int getHireId() {
		return hireId;
	}
	public void setHireId(int hireId) {
		this.hireId = hireId;
	}
	
	public List<Integer> getAlbumidlist() {
		return albumidlist;
	}

	public void setAlbumidlist(List<Integer> albumidlist) {
		this.albumidlist = albumidlist;
	}
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public List<Integer> getHireidlist() {
		return hireidlist;
	}
	public void setHireidlist(List<Integer> hireidlist) {
		this.hireidlist = hireidlist;
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
	public RentalDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RentalDetailsDto(int hireId) {
		super();
		this.hireId = hireId;
	}

	public RentalDetailsDto(List<Integer> hireidlist) {
		super();
		this.hireidlist = hireidlist;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public RentalDetailsDto(int customerid, List<Integer> albumidlist) {
		super();
		this.customerid = customerid;
		this.albumidlist = albumidlist;
	}
	public RentalDetailsDto(int customerid, int albumId) {
		super();
		this.customerid = customerid;
		this.albumId = albumId;
	}
	


	
}

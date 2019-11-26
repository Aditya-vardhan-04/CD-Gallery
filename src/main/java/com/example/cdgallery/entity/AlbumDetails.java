package com.example.cdgallery.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.example.cdgallery.dto.AlbumDetailsDto;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "albumdetails")
public class AlbumDetails {

	
	@Id
	private int albumId;
//@Column(name ="category_Id" )
	private int categoryid;
	private String albumTitle;
	private int hirePrice;
	@Column(name = "number_of_cds")
	private int noOfCds;
	private String status;

	
	
	
	
	

	
	 public int getAlbumId() {
		return albumId;
	}








	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}








	public int getCategoryid() {
		return categoryid;
	}








	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}








	public String getAlbumTitle() {
		return albumTitle;
	}








	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}








	public int getHirePrice() {
		return hirePrice;
	}








	public void setHirePrice(int hirePrice) {
		this.hirePrice = hirePrice;
	}








	public int getNoOfCds() {
		return noOfCds;
	}








	public void setNoOfCds(int noOfCds) {
		this.noOfCds = noOfCds;
	}








	public String getStatus() {
		return status;
	}








	public void setStatus(String status) {
		this.status = status;
	}







//
//	@ManyToOne
//	    private MusicalCategory musicalCategory;



	@ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "categoryid", nullable = false, insertable = false, updatable = false)
      @JsonIgnore
    private MusicalCategory musicalCategorys;




	@OneToMany(cascade=CascadeType.ALL,mappedBy ="albumDetails",fetch = FetchType.LAZY)
    private Set<RentalDetails> rentalDetails;








	
	
}

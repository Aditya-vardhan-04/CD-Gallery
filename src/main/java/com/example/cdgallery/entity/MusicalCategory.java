package com.example.cdgallery.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "musicalcategory")
public class MusicalCategory {

	
	
	@Id
	private int categoryId;	
	private String categoryName;
	private String categoryDescription;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	


	
	@OneToMany(cascade=CascadeType.ALL,mappedBy ="musicalCategorys",fetch = FetchType.LAZY)
    private Set<AlbumDetails> albumDetails;
	
	
	
	
	public Set<AlbumDetails> getAlbumDetails() {
		return albumDetails;
	}
	public void setAlbumDetails(Set<AlbumDetails> albumDetails) {
		this.albumDetails = albumDetails;
	}


	
	
	
}

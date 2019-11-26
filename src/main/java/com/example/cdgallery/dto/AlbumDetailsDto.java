package com.example.cdgallery.dto;

import javax.persistence.Column;

import com.example.cdgallery.entity.AlbumDetails;

public class AlbumDetailsDto {

	
	private int albumId;
	
		private int categoryid;
		private String albumTitle;
		private int hirePrice;
	
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
	
	
}

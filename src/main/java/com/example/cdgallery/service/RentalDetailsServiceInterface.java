package com.example.cdgallery.service;

import java.util.List;

import com.example.cdgallery.dto.RentalDetailsDto;
import com.example.cdgallery.entity.RentalDetails;

public interface RentalDetailsServiceInterface {

	List<RentalDetailsDto> rentedAlbums(int id);
	
	
	
	void hiring(RentalDetailsDto albid);

	public int returningAlbum(int hireid);
	

}



package com.example.cdgallery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cdgallery.dto.AlbumDetailsDto;
import com.example.cdgallery.entity.AlbumDetails;
@Service
public interface ALbumDetailsInteface {

	List<AlbumDetailsDto> albumDetails(int id);
	
	
	
	
	String rentAlbum(int albumid);
	
	int returnAlbumUpdate(int albid);
	
	
}

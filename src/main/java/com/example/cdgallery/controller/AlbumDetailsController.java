package com.example.cdgallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cdgallery.dto.AlbumDetailsDto;
import com.example.cdgallery.dto.RentalDetailsDto;
import com.example.cdgallery.entity.AlbumDetails;
import com.example.cdgallery.repository.AlbumDetailsRepository;
import com.example.cdgallery.service.ALbumDetailsInteface;
import com.example.cdgallery.serviceimpl.AlbumDetailsServiceImpl;
@RestController
public class AlbumDetailsController {
    @Autowired
	private ALbumDetailsInteface albumdetailsservice;
	
	@RequestMapping(method = RequestMethod.GET,value = "/albumDetails/{categ}")
	public List<AlbumDetailsDto> albumsdetails(@PathVariable int categ)
	{		
		return albumdetailsservice.albumDetails(categ);
	}
	
	

	
	
}

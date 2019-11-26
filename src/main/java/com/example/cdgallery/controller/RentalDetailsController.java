package com.example.cdgallery.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cdgallery.dto.RentalDetailsDto;
import com.example.cdgallery.entity.RentalDetails;
import com.example.cdgallery.service.ALbumDetailsInteface;
import com.example.cdgallery.service.RentalDetailsServiceInterface;
import com.example.cdgallery.serviceimpl.AlbumDetailsServiceImpl;
import com.example.cdgallery.serviceimpl.RentalDetailsService;

@CrossOrigin("http://localhost:8080")
@RestController
public class RentalDetailsController {
	
	@Autowired
	private RentalDetailsServiceInterface rentalDetailService;
	
	@Autowired
	private ALbumDetailsInteface albumDetailsService;
	
	
	@RequestMapping(method = RequestMethod.GET,value = "/rentedAlbums/{userid}")
	public List<RentalDetailsDto>  hiredalbums(@PathVariable int userid){
				
		return rentalDetailService.rentedAlbums(userid);
	}
	
	
	
	@RequestMapping(method =RequestMethod.POST,value = "/rentalbum")
	public String rentAlbum(@RequestBody RentalDetailsDto rentalb)
	{
		
		
		String check=null;
		List<Integer> albvalues=rentalb.getAlbumidlist();
		int customer=rentalb.getCustomerid();
		for (Integer albs :albvalues) {
		int albsid=albs.intValue();
		RentalDetailsDto albumdet=new RentalDetailsDto(customer,albsid);

		int albuid=albumdet.getAlbumId();
		 check=albumDetailsService.rentAlbum(albuid);
		
		if(check=="available")
		{
			rentalDetailService.hiring(albumdet);
		
			check="Album is hired";
		}
		else {
			check="Not Hired";
		}
		
		}
		return check;
		
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/returnalbum")
	public int returnAlbumm(@RequestBody RentalDetailsDto hireidlist)
	{		
		
		int totalprice=0;
		List<Integer> hireidvalues=hireidlist.getHireidlist();
		for (Integer hires :hireidvalues) {
			int hiredid=hires.intValue();
			
			
			RentalDetailsDto hiredet=new RentalDetailsDto(hiredid);
			
			
		totalprice=totalprice+rentalDetailService.returningAlbum(hiredid);
		
		}
		return totalprice;
	}
	
	
	
	
	
	
	
	
	
}

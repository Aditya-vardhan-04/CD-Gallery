package com.example.cdgallery.serviceimpl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cdgallery.dto.AlbumDetailsDto;
import com.example.cdgallery.dto.RentalDetailsDto;
import com.example.cdgallery.entity.AlbumDetails;
import com.example.cdgallery.entity.RentalDetails;
import com.example.cdgallery.repository.RentalDetailsRepository;
import com.example.cdgallery.service.RentalDetailsServiceInterface;
@Service
public class RentalDetailsService implements RentalDetailsServiceInterface {

	@Autowired
	private RentalDetailsRepository rentalDetailsRepository;
	@Autowired
	private AlbumDetailsServiceImpl albumDetailService;
	
	@Override
	public List<RentalDetailsDto> rentedAlbums(int userid) {

		return convertToDto(rentalDetailsRepository.findByCustomerid(userid));
	}


	
	public void hiring(RentalDetailsDto albid) {
		// TODO Auto-generated method stub
		RentalDetails rent=new RentalDetails();
		
		rent.setAlbumId(albid.getAlbumId());
		rent.setCustomerid(albid.getCustomerid());
		rent.setHireDate(new Date());
		rent.setStatus("Hired");
		rent.setReturnDate(null);
	
		rentalDetailsRepository.save(rent);
			
		
	}



	@Override
	public int returningAlbum(int hireid) {
		// TODO Auto-generated method stub
		RentalDetails give=rentalDetailsRepository.getOne(hireid);
		if(give.getStatus().equals("returned"))
		{
		return 0;	
		}
		else
		{
		give.setReturnDate(new Date());
		give.setStatus("returned");
		int albid=give.getAlbumId();
		
		
		rentalDetailsRepository.save(give);
		
		return albumDetailService.returnAlbumUpdate(albid);
		}
		}
	
	
	
	
	
	
	
	
	
	
	
	private List<RentalDetailsDto> convertToDto(List<RentalDetails> rentaldetails)
	{
		ModelMapper modelMapper = new ModelMapper();
		
	List<RentalDetailsDto> albumdetailsDto= Arrays.asList(modelMapper.map(rentaldetails, RentalDetailsDto[].class));
	return albumdetailsDto;
	}
	
	
	
	
	
	
	
	
	
	
	
}

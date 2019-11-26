package com.example.cdgallery.serviceimpl;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cdgallery.dto.AlbumDetailsDto;
import com.example.cdgallery.entity.AlbumDetails;
import com.example.cdgallery.repository.AlbumDetailsRepository;
import com.example.cdgallery.service.ALbumDetailsInteface;
@Service
public class AlbumDetailsServiceImpl implements ALbumDetailsInteface {

	@Autowired
	private AlbumDetailsRepository albumDetailsRepository; 
//	@Autowired
//	private ModelMapper modelMapper;

	
	public List<AlbumDetailsDto> albumDetails(int categ) {
		// TODO Auto-generated method stub
		
		
		return convertToDto(albumDetailsRepository.findByCategoryid(categ));
	}
	
	private List<AlbumDetailsDto> convertToDto(List<AlbumDetails> albumdetails)
	{
		ModelMapper modelMapper = new ModelMapper();
//	List<AlbumDetailsDto> albumdetailsDto=  modelMapper.map(albumdetails,AlbumDetails.class).collect(Collectors.toList());
		
	List<AlbumDetailsDto> albumdetailsDto= Arrays.asList(modelMapper.map(albumdetails, AlbumDetailsDto[].class));
	return albumdetailsDto;
	}
	
	public String rentAlbum(int albumid) {
		// TODO Auto-generated method stub
		
		AlbumDetails check=albumDetailsRepository.getOne(albumid);
		int num=check.getNoOfCds();
		String stat=check.getStatus();
		String feedback;
		if(stat.equals("A"))
		{
			feedback="available";
			if(num==1)
			{
			num=num-1;
			check.setStatus("NA");
			check.setNoOfCds(num);
			albumDetailsRepository.save(check);
			
						}
			else
			{
				
				num=num-1;
				check.setNoOfCds(num);
				albumDetailsRepository.save(check);
				
			}
		}
		else {
			feedback="not available";
		}
		
		
		
		return feedback;
	}


	@Override
	public int returnAlbumUpdate(int albid) {
		// TODO Auto-generated method stub
		AlbumDetails checker=albumDetailsRepository.getOne(albid);
		
		
		if (checker.getNoOfCds()==0)
		{
		checker.setNoOfCds(checker.getNoOfCds()+1);
		checker.setStatus("A");
		albumDetailsRepository.save(checker);
		}
		else
		{
			checker.setNoOfCds(checker.getNoOfCds()+1);
			albumDetailsRepository.save(checker);
		}
		
		
		return checker.getHirePrice();
	}

}

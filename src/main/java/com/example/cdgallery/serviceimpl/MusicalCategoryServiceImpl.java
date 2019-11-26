package com.example.cdgallery.serviceimpl;

import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cdgallery.dto.AlbumDetailsDto;
import com.example.cdgallery.dto.MusicalCategoryDto;
import com.example.cdgallery.entity.AlbumDetails;
import com.example.cdgallery.entity.MusicalCategory;
import com.example.cdgallery.repository.MusicalCategoryRepository;
import com.example.cdgallery.service.MusicalCategoryInterface;
@Service
public class MusicalCategoryServiceImpl implements MusicalCategoryInterface {

	@Autowired
	private MusicalCategoryRepository musicalCategoryRepository;
	
	
	public List<MusicalCategoryDto> displayCategorys() {
				
		
		return convertToDto(musicalCategoryRepository.findAll());
	}

	
	
	private List<MusicalCategoryDto> convertToDto(List<MusicalCategory> categorydetails)
	{
		ModelMapper modelMapper = new ModelMapper();
		
	List<MusicalCategoryDto> musicalCategoryDto= Arrays.asList(modelMapper.map(categorydetails, MusicalCategoryDto[].class));
	return musicalCategoryDto;
	}
	
	
	
	
	
}

package com.example.cdgallery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cdgallery.dto.MusicalCategoryDto;
import com.example.cdgallery.entity.MusicalCategory;
@Service
public interface MusicalCategoryInterface {

	List<MusicalCategoryDto> displayCategorys();
	
	
	
}

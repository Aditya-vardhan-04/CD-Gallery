package com.example.cdgallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cdgallery.dto.MusicalCategoryDto;
import com.example.cdgallery.entity.MusicalCategory;
import com.example.cdgallery.service.MusicalCategoryInterface;
import com.example.cdgallery.serviceimpl.MusicalCategoryServiceImpl;

@RestController
public class MusicalCategoryController {

	@Autowired
	private MusicalCategoryInterface musicalCategoryService;
	
	
	@RequestMapping(method = RequestMethod.GET,value = "/musicalCategorys")
	public List<MusicalCategoryDto> categorys()
	{
				return musicalCategoryService.displayCategorys(); 
	}
	
}

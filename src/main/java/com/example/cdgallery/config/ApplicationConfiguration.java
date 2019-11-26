package com.example.cdgallery.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ApplicationConfiguration {

	public ApplicationConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModelMapper modelmapper()
	{
		return new ModelMapper();
		
	}
	
}

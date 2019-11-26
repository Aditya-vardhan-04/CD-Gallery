package com.example.cdgallery.service;

import org.springframework.stereotype.Service;

import com.example.cdgallery.dto.CustomerDto;

import com.example.cdgallery.entity.Customer;

@Service
public interface CustomerServiceInterface {

	public int registerUser(CustomerDto register);
	
	
	
	boolean validateCredentials(CustomerDto login);
	
	
}

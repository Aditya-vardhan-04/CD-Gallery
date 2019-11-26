package com.example.cdgallery.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cdgallery.dto.CustomerDto;

import com.example.cdgallery.entity.Customer;
import com.example.cdgallery.service.CustomerServiceInterface;
import com.example.cdgallery.serviceimpl.CustomerServiceImpl;


@RestController
public class CustomerController {

	@Autowired
	private CustomerServiceInterface customerService;
	

	
	
	@RequestMapping(method = RequestMethod.POST,value = "/register")
	public int registerCustomer(@RequestBody CustomerDto register)
	{
		
			return customerService.registerUser(register);
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/login")
	public Boolean validateCustomer(@RequestBody CustomerDto userDto) {
		
		
		return customerService.validateCredentials(userDto);
	}
	
	
	
}

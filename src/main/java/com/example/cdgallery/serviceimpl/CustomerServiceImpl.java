package com.example.cdgallery.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cdgallery.dto.AlbumDetailsDto;
import com.example.cdgallery.dto.CustomerDto;

import com.example.cdgallery.entity.AlbumDetails;
import com.example.cdgallery.entity.Customer;

import com.example.cdgallery.repository.CustomerRepository;

import com.example.cdgallery.service.CustomerServiceInterface;
@Service
public class CustomerServiceImpl implements CustomerServiceInterface {

	@Autowired
	private CustomerRepository customerRepository;
	
//	@Autowired
//	private ModelMapper modelMapper;

	
	
	
	public int registerUser(CustomerDto register) {
		// TODO Auto-generated method stub
		
		

		
		
		return convertToDto(customerRepository.save(convertToEntity(register)));
	}
	
	private int convertToDto(Customer customerdetails)
	{
		ModelMapper modelMapper = new ModelMapper();

		CustomerDto customerDto=modelMapper.map(customerdetails,CustomerDto.class);
		return customerDto.getCustomerId();
	}
	
	
	
	private Customer convertToEntity(CustomerDto customerdetails)
	{
		ModelMapper modelMapper = new ModelMapper();

		Customer customer=modelMapper.map(customerdetails,Customer.class);
		return customer;
	}
	
	
	
	
	
	public boolean validateCredentials(CustomerDto login) {
		// TODO Auto-generated method stub
        boolean value=false;
        System.out.println(convertToEntity(login).getPassword());
        
		Customer check=customerRepository.getOne(convertToEntity(login).getCustomerid());
		System.out.println(check.getPassword());
		
		if(check.getPassword()!=null)
				{
			
		if(check.getPassword().equals(convertToEntity(login).getPassword()))
		{
			value=true;
		
		}
				}
		return value;
	}


	
	

	
	
	
	
	
	
	
	
}

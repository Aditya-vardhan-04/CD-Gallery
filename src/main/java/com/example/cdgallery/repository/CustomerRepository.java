package com.example.cdgallery.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.cdgallery.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	 @Query(value = "SELECT max(customerId) from Customer", nativeQuery = true)
	    int getMaxId();
	
	
	
}

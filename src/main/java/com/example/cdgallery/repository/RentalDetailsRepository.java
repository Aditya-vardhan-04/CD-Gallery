package com.example.cdgallery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.cdgallery.entity.RentalDetails;
@Repository
public interface RentalDetailsRepository extends JpaRepository<RentalDetails, Integer> {

	
	@Query("FROM RentalDetails WHERE status='Hired' and customerid=?1")
	List<RentalDetails> findByCustomerid(int userid);
	
	
	
	
	
	
	
}

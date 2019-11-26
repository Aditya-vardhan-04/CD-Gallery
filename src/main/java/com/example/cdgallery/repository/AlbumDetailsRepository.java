package com.example.cdgallery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cdgallery.dto.AlbumDetailsDto;
import com.example.cdgallery.entity.AlbumDetails;
@Repository
public interface AlbumDetailsRepository extends JpaRepository<AlbumDetails, Integer> {

	
	List<AlbumDetails> findByCategoryid(int categ);
	
	
	
}

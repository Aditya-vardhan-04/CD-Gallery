package com.example.cdgallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cdgallery.entity.MusicalCategory;
@Repository
public interface MusicalCategoryRepository extends JpaRepository<MusicalCategory, Integer> {

}

package com.solugenix.TourismProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solugenix.TourismProject.model.TourPackage;

@Repository
public interface PackageRepository extends JpaRepository<TourPackage, Integer>  {

	TourPackage findByLocation(String location);
}

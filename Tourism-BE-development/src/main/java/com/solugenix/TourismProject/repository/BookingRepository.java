package com.solugenix.TourismProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solugenix.TourismProject.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer>{
	
	List<Booking> findByUsername(String username);

} 

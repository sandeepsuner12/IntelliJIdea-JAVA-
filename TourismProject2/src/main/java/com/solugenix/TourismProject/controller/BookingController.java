package com.solugenix.TourismProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solugenix.TourismProject.model.AdminBookingshow;
import com.solugenix.TourismProject.model.Booking;

import com.solugenix.TourismProject.service.BookingService;

@RestController
@CrossOrigin
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	
	@PostMapping("/booking")
	public ResponseEntity<Booking> createBooking(@RequestBody Booking booking)
	{
		
		return ResponseEntity.of(Optional.of(bookingService.createBooking(booking)));
		
	}
	@GetMapping("/booking")
	public ResponseEntity<List<Booking>> getAllBookings(Booking booking)
	{
		
		return ResponseEntity.of(Optional.of(bookingService.getBookinglist(booking)));
	}
	@GetMapping("/user/booking")
	public ResponseEntity<List<Booking>> getUsersBooking(@RequestParam String username)
	{
		return ResponseEntity.of(Optional.of(bookingService.getUSerBookingList(username)));
	}
	@DeleteMapping("/booking")
	public ResponseEntity<String> deleteBooking(@RequestParam int id)
	{
		return ResponseEntity.ok(bookingService.deleteBooking(id));
		
	}
	@PutMapping("/booking")
	public ResponseEntity<Booking> updateBooking(@RequestBody Booking booking)
	{
		return null;
	}

	

}

package com.solugenix.TourismProject.service;

import java.util.List;

import com.solugenix.TourismProject.model.AdminBookingshow;
import com.solugenix.TourismProject.model.Booking;

public interface BookingService 
{

	public Booking createBooking(Booking booking);
	public List<Booking> getBookinglist(Booking booking);
	public List<Booking> getUSerBookingList(String username);
	public String deleteBooking(int id);
	public Booking updateBooking(Booking booking);
}

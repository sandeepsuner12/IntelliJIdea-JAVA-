package com.solugenix.TourismProject.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solugenix.TourismProject.model.AdminBookingshow;
import com.solugenix.TourismProject.model.Booking;
import com.solugenix.TourismProject.model.TourPackage;
import com.solugenix.TourismProject.model.User;
import com.solugenix.TourismProject.repository.AdminRepository;
import com.solugenix.TourismProject.repository.BookingRepository;
import com.solugenix.TourismProject.repository.PackageRepository;
import com.solugenix.TourismProject.repository.UserRepository;
import com.solugenix.TourismProject.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	private BookingRepository bookingRepository;
	@Autowired
	private PackageRepository packageRepository;
	@Autowired
	private UserRepository userRepository;
	


	@Override
	public Booking createBooking(Booking booking) 
	{
//		TourPackage pkPackage=booking.getPackageid();
//		User user=booking.getUserid();
//		
//		booking.setUserid(user);
//		booking.setPackageid(pkPackage);
//		int userId = booking.getUserid().getId();
//        int packageId = booking.getPackageid().getId();
//		
//		TourPackage package1=packageRepository.findById(packageId).orElse(null);
//		User user=userRepository.findById(userId).orElse(null);
//		
//		booking.setUserid(user);
//		booking.setPackageid(package1);
		return 	bookingRepository.save(booking);
	}

	@Override
	public List<Booking> getBookinglist(Booking booking) 
	{
		
		return bookingRepository.findAll();
	}

	@Override
	public String deleteBooking(int id) {
		bookingRepository.deleteById(id);
		return "Booking deleted Succesfully";
	}

	@Override
	public Booking updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> getUSerBookingList(String username) 
	{
	return 	bookingRepository.findByUsername(username);
		
	}

}

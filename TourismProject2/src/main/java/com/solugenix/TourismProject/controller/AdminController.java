package com.solugenix.TourismProject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.solugenix.TourismProject.model.Admin;
import com.solugenix.TourismProject.service.AdminService;

import jakarta.annotation.PostConstruct;

@CrossOrigin
@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	 
	@PostMapping("/admin")
	public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin)
	{
		
		Admin admin2=null;
		  try {
		   admin2 = adminService.createAdmin(admin);
		   System.out.println("Admin Controller Called!!");
		   return ResponseEntity.of(Optional.of(admin2));
		  }
		  catch(Exception ex)
		  {
			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		  }
	}
	@GetMapping("/admin/{id}")
	public ResponseEntity<Admin> getAdmin(@PathVariable int id)
	{
		
		Admin admin=adminService.getAdmin(id);
		if(admin==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(admin));
		
	}
	@DeleteMapping("/admin/{id}")
	public ResponseEntity<Admin> deleteAdmin(@PathVariable int id)
	{
		
		try {
			 adminService.deleteAdmin(id);
			 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}

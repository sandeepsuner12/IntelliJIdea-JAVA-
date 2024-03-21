package com.solugenix.TourismProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solugenix.TourismProject.model.User;
import com.solugenix.TourismProject.service.UserService;

@CrossOrigin
@RestController
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		
		try {
			
//		userService.createUser(user);
		return ResponseEntity.ok(userService.createUser(user));
		}
		catch(Exception ex)
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	@GetMapping("/admin/users")
	public ResponseEntity<List<User>> getAllUser()
	{
		List<User> uList=userService.getAllUsers();
		return ResponseEntity.ok(uList);
	}
	@GetMapping("/userbyemail")
	public ResponseEntity<User> getUserByEmail(@RequestParam String email)
	{
		return ResponseEntity.of(Optional.of(userService.getUserByEmail(email)));
	}
}

package com.solugenix.TourismProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solugenix.TourismProject.config.JwtHelper;
import com.solugenix.TourismProject.model.Admin;
import com.solugenix.TourismProject.model.JwtRequest;
import com.solugenix.TourismProject.model.JwtResponse;
import com.solugenix.TourismProject.model.Status;
import com.solugenix.TourismProject.model.User;
import com.solugenix.TourismProject.service.LoginService;

@CrossOrigin
@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	
	
	@PostMapping("/adminloginverify")
	public JwtResponse verifyAdmin(@RequestBody JwtRequest jwtRequest)
	{
		return loginService.verifyLogin(jwtRequest);
	}
	@PostMapping("/userloginVerify")
	public JwtResponse verifyLogin(@RequestBody JwtRequest jwtRequest)
	{
		return loginService.verifyLoginUser(jwtRequest);
	}
//	@PostMapping("/validate")
//	public Status isValidate(@RequestBody User user)
//	{
//		return loginService.isValidate(user);
//	}
	@PostMapping("/forgotpassword")
	public Status forgotPassword(@RequestBody User user )
	{
		return loginService.forgotPassword(user.getEmail(),user.getPhnumber());
	}
	@PostMapping("/confirmpassword")
	public Status confirmPassword(@RequestBody User data,@RequestParam String email)
	{
		System.out.println("data"+ data + email);
		return loginService.confirmPassword(data.getPassword(), email);
	}
}

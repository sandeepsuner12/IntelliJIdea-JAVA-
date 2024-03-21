package com.solugenix.TourismProject.service;

import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;

import com.solugenix.TourismProject.model.Admin;
import com.solugenix.TourismProject.model.JwtRequest;
import com.solugenix.TourismProject.model.JwtResponse;
import com.solugenix.TourismProject.model.Status;
import com.solugenix.TourismProject.model.User;

public interface LoginService {

	
	public JwtResponse verifyLogin(JwtRequest jwtRequest);
	public JwtResponse verifyLoginUser(JwtRequest jwtRequest);
	public Status forgotPassword(String email,long mobile);
	public Status confirmPassword(String password,String userEmail);
}
package com.solugenix.TourismProject.service;

import java.util.List;

import com.solugenix.TourismProject.model.User;

public interface UserService {

	public User createUser(User user);
	public List<User> getAllUsers();

}

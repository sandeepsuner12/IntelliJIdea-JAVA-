package com.solugenix.TourismProject.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.solugenix.TourismProject.model.User;
import com.solugenix.TourismProject.repository.UserRepository;
import com.solugenix.TourismProject.service.UserService;

@Service
public class UserServiceImpl implements  UserService{

	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	public User createUser(User user) 
	{
		System.out.println(user);
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}
	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}
	@Override
	public User getUserByEmail(String email) {
	 return userRepository.findByEmail(email);
	}
	
	

}

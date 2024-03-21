package com.solugenix.TourismProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solugenix.TourismProject.model.User;


public interface UserRepository extends JpaRepository<User, Integer>{

	 User findByEmail(String email);
}

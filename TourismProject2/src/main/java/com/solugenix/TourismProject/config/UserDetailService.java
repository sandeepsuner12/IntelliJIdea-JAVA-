package com.solugenix.TourismProject.config;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.solugenix.TourismProject.model.Admin;
import com.solugenix.TourismProject.model.User;
import com.solugenix.TourismProject.repository.AdminRepository;
import com.solugenix.TourismProject.repository.UserRepository;

public class UserDetailService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	@Autowired 
	private AdminRepository adminRepository;
	@Override
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		User user=userRepository.findByEmail(username);
		Admin admin=adminRepository.findByUsername(username);
		 if (user != null) {
	            // Regular user found
	            return buildUserDetails(user.getEmail(), user.getPassword());
	        } else if (admin != null) {
	            // Admin user found
	            return buildUserDetails(admin.getUsername(), admin.getPassword());
	        } else {
	            // Neither regular user nor admin found
	            throw new UsernameNotFoundException("User not found with username: " + username);
	        }
		 
	}

    private UserDetails buildUserDetails(String username, String password) {
        // Use a default role ("USER") for every authenticated user
        List<GrantedAuthority> authorities = Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));

        return new org.springframework.security.core.userdetails.User(
                username,
                password,
                authorities
        );
    }
	
	

}

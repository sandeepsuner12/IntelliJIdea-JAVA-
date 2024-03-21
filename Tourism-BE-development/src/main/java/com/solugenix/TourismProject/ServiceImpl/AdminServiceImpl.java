package com.solugenix.TourismProject.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.solugenix.TourismProject.model.Admin;
import com.solugenix.TourismProject.repository.AdminRepository;
import com.solugenix.TourismProject.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public Admin createAdmin(Admin a) {

		System.out.println("Admin Service Implementation called");
		a.setPassword(passwordEncoder.encode(a.getPassword()));
		return adminRepository.save(a); 
		
	}
	@Override
	public Admin getAdmin(int id) {
		
		return adminRepository.findById(id).orElse(null);
	}
	@Override
	public String deleteAdmin(int id) {
			adminRepository.deleteById(id);
			return "Admin Deleted Succesfully!!";
	}
	
	
	

}

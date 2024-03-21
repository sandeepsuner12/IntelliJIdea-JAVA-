package com.solugenix.TourismProject.service;

import com.solugenix.TourismProject.model.Admin;


public interface AdminService {
	
	public Admin createAdmin(Admin admin);
	public Admin getAdmin(int id);
	public String deleteAdmin(int id);

}

package com.solugenix.TourismProject.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.solugenix.TourismProject.model.Status;
import com.solugenix.TourismProject.model.TourPackage;

public interface PackageService {

	
	public TourPackage createPackage(TourPackage pk,String image) throws IOException;
	public TourPackage updatePAckage(TourPackage pk,int id);
	public Status deletePackage(int id);
	public List<TourPackage> getAllPAckagesList();
	public TourPackage getPackageById(int id);
}

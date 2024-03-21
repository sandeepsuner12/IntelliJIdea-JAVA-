package com.solugenix.TourismProject.ServiceImpl;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.solugenix.TourismProject.model.Status;
import com.solugenix.TourismProject.model.TourPackage;
import com.solugenix.TourismProject.repository.PackageRepository;
import com.solugenix.TourismProject.service.PackageService;

@Service
public class PackageServiceImpl implements PackageService{

	
	@Autowired
	private PackageRepository packageRepository;

	public TourPackage createPackage(TourPackage pk,String image) throws IOException
	{
		
		TourPackage createPackage=new TourPackage();
		createPackage.setLocation(pk.getLocation());
		createPackage.setDescription(pk.getDescription());
		createPackage.setNumberofDays(pk.getNumberofDays());
		createPackage.setPrice(pk.getPrice());
		
		 /*String photo = ""; // Initialize the photo variable with an empty string

	        if (!image.isEmpty())
	        {
	            photo = image.getOriginalFilename().trim(); // Get the original filename from MultipartFile
	            InputStream i = image.getInputStream();
	            
	            String path = "C:\\Users\\RiyaRaghuvanshi\\eclipse-workspace\\TourismProject\\src\\main\\webapp\\pictures" + photo;
	            
	            
	            int bytes = 0;
	            FileOutputStream fs = new FileOutputStream(path);
	            while ((bytes = i.read()) != -1)
	                fs.write(bytes);
	            
	            fs.close();
	 
	           }*/
	        createPackage.setPicture(pk.getPicture());
			return packageRepository.save(createPackage);
	}

	@Override
	public TourPackage updatePAckage(TourPackage pk,int id) 
	{
		TourPackage updatePackage=packageRepository.findById(id).orElse(null);
		updatePackage.setLocation(pk.getLocation());
		updatePackage.setDescription(pk.getDescription());
		updatePackage.setNumberofDays(pk.getNumberofDays());
		updatePackage.setPrice(pk.getPrice());
		
		return packageRepository.save(updatePackage);
	}

	@Override
	public Status deletePackage(int id) {
		packageRepository.deleteById(id);
		return new Status(true);
	}

	@Override
	public List<TourPackage> getAllPAckagesList() {
		return packageRepository.findAll();
		
	}

	@Override
	public TourPackage getPackageById(int id) {
		
		return packageRepository.findById(id).orElse(null);
	}
	
	
}

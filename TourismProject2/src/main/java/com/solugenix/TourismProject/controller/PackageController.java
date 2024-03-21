package com.solugenix.TourismProject.controller;

import java.io.IOException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solugenix.TourismProject.model.Status;
import com.solugenix.TourismProject.model.TourPackage;
import com.solugenix.TourismProject.service.PackageService;

@CrossOrigin
@RestController
public class PackageController {
/*@RequestParam("picutre")MultipartFile*/
	
	@Autowired 
	private PackageService packageService;
	
	@PostMapping("/admin/package")
	public ResponseEntity<TourPackage> createPackage(@RequestBody TourPackage pk,String image) throws IOException
	 {
		 TourPackage pk2=packageService.createPackage(pk,image);
		 return ResponseEntity.of(Optional.of(pk2));
     }
	@PutMapping("/admin/package")
	public ResponseEntity<TourPackage> updatPackage(@RequestBody TourPackage pk,@RequestParam int id)
	{
		TourPackage updateTourPackage=packageService.updatePAckage(pk,id);
		
		return ResponseEntity.of(Optional.of(updateTourPackage));
	}
	@DeleteMapping("/admin/package")
	public ResponseEntity<Status> deletePackageById(@RequestParam int id)
	{

		return ResponseEntity.of(Optional.of(packageService.deletePackage(id)));
	}
	@GetMapping("/packages")
	public ResponseEntity<List<TourPackage>> getAllPackages()
	{
		return ResponseEntity.ok(packageService.getAllPAckagesList());
	}
	@GetMapping("/admin/package")
	public ResponseEntity<TourPackage> getPackageById(@RequestParam int id)
	{
		return ResponseEntity.of(Optional.of(packageService.getPackageById(id)));
	}
}

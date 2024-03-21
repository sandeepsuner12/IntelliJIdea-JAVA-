package com.solugenix.TourismProject.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Package_details")
public class TourPackage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String location;
	private String description;
	private int numberofDays;
	private int price;
	private String picture;
	public TourPackage(int id, String location, String description, int numberofDays, int price, String picture) {
		super();
		this.id = id;
		this.location = location;
		this.description = description;
		this.numberofDays = numberofDays;
		this.price = price;
		this.picture = picture;
	}
	public TourPackage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNumberofDays() {
		return numberofDays;
	}
	public void setNumberofDays(int numberofDays) {
		this.numberofDays = numberofDays;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	
	
	
	
}

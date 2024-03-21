package com.solugenix.TourismProject.model;



import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="Booking_details")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numberOfPerson;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date startDate; 
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="user_id")
	private String username;
//	@OneToOne(cascade = CascadeType.ALL) 
//	@JoinColumn(name="package_id") 
	private String packageid;
	//private boolean isDone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumberOfPerson() {
		return numberOfPerson;
	}
	public void setNumberOfPerson(int numberOfPerson) {
		this.numberOfPerson = numberOfPerson;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPackageid() {
		return packageid;
	}
	public void setPackageid(String packageid) {
		this.packageid = packageid;
	}
	public Booking(int id, int numberOfPerson, Date startDate, String username, String packageid) {
		super();
		this.id = id;
		this.numberOfPerson = numberOfPerson;
		this.startDate = startDate;
		this.username = username;
		this.packageid = packageid;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

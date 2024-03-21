package com.solugenix.TourismProject.model;

import java.sql.Date;

public class AdminBookingshow {
	private int bid;
	private String uemail;
	private String uFirstName;
	private String uLastName;
	private Date date;
	private int duration;
	private int numberOfPerson;
	private String packagename;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getuFirstName() {
		return uFirstName;
	}
	public void setuFirstName(String uFirstName) {
		this.uFirstName = uFirstName;
	}
	public String getuLastName() {
		return uLastName;
	}
	public void setuLastName(String uLastName) {
		this.uLastName = uLastName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getNumberOfPerson() {
		return numberOfPerson;
	}
	public void setNumberOfPerson(int numberOfPerson) {
		this.numberOfPerson = numberOfPerson;
	}
	public String getPackagename() {
		return packagename;
	}
	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}
	public AdminBookingshow(int bid, String uemail, String uFirstName, String uLastName, Date date, int duration,
			int numberOfPerson, String packagename) {
		super();
		this.bid = bid;
		this.uemail = uemail;
		this.uFirstName = uFirstName;
		this.uLastName = uLastName;
		this.date = date;
		this.duration = duration;
		this.numberOfPerson = numberOfPerson;
		this.packagename = packagename;
	}
	public AdminBookingshow() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

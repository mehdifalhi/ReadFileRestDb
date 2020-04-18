package com.fali.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fun {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String fname;
	private String lname;
	private String Adress;
	private String age;
	private String club;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
		

}

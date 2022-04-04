package com.in28minute.learnspring.boot.courses.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;


/**
 * The persistent class for the student database table.
 * 
 */

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	private String email;
	
	private String country;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dob;

	private boolean firstAttempt;

	private String firstName;

	private int id;

	private String lastName;
	
	private String section;

	private String sex;
	
	private List<String> subjects = new ArrayList<String>();

	

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	 public boolean isFirstAttempt() {
	        return firstAttempt;
	    }
	 
	    public void setFirstAttempt(boolean firstAttempt) {
	        this.firstAttempt = firstAttempt;
	    }

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSection() {
		return this.section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<String> getSubjects() {
        return subjects;
    }
 
    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
	
	

}
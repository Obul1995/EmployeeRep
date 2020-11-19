package com.societe.employee.api.model;

import java.io.Serializable;

import org.springframework.validation.annotation.Validated;

import io.swagger.annotations.ApiModel;

/**
 * Employee Details
 */
@ApiModel(description = "Employee Details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-11-17T04:10:17.980Z")




public class EmployeeRequest   implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String firstName;
	public String lastName;
	public String dob;
	public String gender;
	public String department;
  
  


public EmployeeRequest() {
	super();
	// TODO Auto-generated constructor stub
}


public EmployeeRequest(String firstName, String lastName, String dob, String gender, String department) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.dob = dob;
	this.gender = gender;
	this.department = department;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getDob() {
	return dob;
}


public void setDob(String dob) {
	this.dob = dob;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public String getDepartment() {
	return department;
}


public void setDepartment(String department) {
	this.department = department;
}

 
}


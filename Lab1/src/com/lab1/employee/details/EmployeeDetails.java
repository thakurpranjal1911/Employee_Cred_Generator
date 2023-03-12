package com.lab1.employee.details;

public class EmployeeDetails {
	
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String password;
	
	//Employee parameterized constructor
	public EmployeeDetails(String firstName, String lastName){
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	//Setter for firstName & lastName
	public String getFirstName() {
		return firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	//Department getter & setter
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	//Email getter & setter
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	//Password getter & setter
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}

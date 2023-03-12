package com.lab1.employee.services;

import java.util.Random;

import com.lab1.employee.details.EmployeeDetails;

public class CredentialService implements EmployeeService{
	

	//Method to generate email as per the desired criteria: firstNamelastName@department.company.com
	public final String COMPANY_DOMAIN = "gl.com";
	
	@Override
	public void generateEmail(EmployeeDetails EmpDetails) {
		// TODO Auto-generated method stub
		
		String email = EmpDetails.getFirstName() + EmpDetails.getLastName() + "@" + EmpDetails.getDepartment() + "." + COMPANY_DOMAIN;
		
		EmpDetails.setEmail(email.toLowerCase());
		
	}

	

	//Method to generate password as per specified criteria: It should contain Uppercase, lowercase, numbers and special characters
        public final int length = 8;
	
	@Override
	public void generatePassword(EmployeeDetails EmpDetails) {
		
	    String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	    String specialCharacters = "!@#$";
	    String numbers = "1234567890";
	    
	    String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	    
	    String password = "";
	    
	    Random random = new Random();
	    
	    for(int i = 0; i < length; i++) {
	    	
	    	password = password+combinedChars.charAt(random.nextInt(combinedChars.length()));
	    	
	    }
		
		EmpDetails.setPassword(password);
		
	}
	
	
	
	//Method to Display generated Email and Password

	@Override
	public void showCredentials(EmployeeDetails EmpDetails) {
		// TODO Auto-generated method stub
		
		System.out.println("Dear "+EmpDetails.getFirstName()+" your generated credentials are as follows:"
				+ "\nEmail    ---> "+EmpDetails.getEmail()
				+ "\nPassword ---> "+EmpDetails.getPassword());
		
	}

	
	

}

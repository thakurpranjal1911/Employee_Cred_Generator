package com.lab1.driver;

import java.util.Scanner;

import com.lab1.employee.details.EmployeeDetails;
import com.lab1.employee.services.*;

public class MainClass {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		EmployeeDetails emp = new EmployeeDetails("Pranjal", "Thakur");
		
		CredentialService service = new CredentialService();
		
		System.out.println("Please Select your department:"
				+ "\n1. Tech"
				+ "\n2. Admin"
				+ "\n3. Human Resource"
				+ "\n4. Legal");
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1: emp.setDepartment("Tech");
		        break;
		        
		case 2: emp.setDepartment("Admin");
                break;
        
		case 3: emp.setDepartment("HR");
                break;
        
		case 4: emp.setDepartment("Legal");
                break;
                
        default: System.out.println("Please Select a valid choice");
                 break;
		
		}
	    
		//Calling CredentialServices methods
		service.generateEmail(emp);
        service.generatePassword(emp);
	    service.showCredentials(emp);
	    
		scan.close();
	}

}

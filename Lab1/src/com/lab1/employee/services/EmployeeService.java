package com.lab1.employee.services;

import com.lab1.employee.details.*;

public interface EmployeeService {
	
	public  void generateEmail(EmployeeDetails EmpDetails);
	public  void generatePassword(EmployeeDetails EmpDetails);
	public  void showCredentials(EmployeeDetails EmpDetails);

}

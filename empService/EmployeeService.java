package com.excelr.finalproject.EmployeeManagementProject.empService;


import java.util.List;

import com.excelr.finalproject.EmployeeManagementProject.EmployeeDetails.EmployeeDetails;
public interface EmployeeServices {
	
	public EmployeeDetails saveEmp(EmployeeDetails add);
	public EmployeeDetails updateEmp(EmployeeDetails add, int empcode);
	public EmployeeDetails delete(int empcode);
	public List<EmployeeDetails> getAllEmp(EmployeeDetails admin);
	
	
}

package com.excelr.finalproject.EmployeeManagementProject.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.finalproject.EmployeeManagementProject.AdminDetails.AdminDetails;
import com.excelr.finalproject.EmployeeManagementProject.EmployeeDetails.EmployeeDetails;
import com.excelr.finalproject.EmployeeManagementProject.Repository.Repositoryy;
import com.excelr.finalproject.EmployeeManagementProject.Services.AdminServices;

@Service
public class AdminServiceImp implements AdminServices{
	
	@Autowired
	private Repositoryy repp;


	@Override
	public List<AdminDetails> getAllAdmins(AdminDetails admin) {
		return repp.findAll();
	}

	@Override
	public AdminDetails saveAdmin(AdminDetails add) {
		add = repp.save(add);
		return add;
	}


}

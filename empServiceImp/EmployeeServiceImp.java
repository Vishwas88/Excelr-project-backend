package com.excelr.finalproject.EmployeeManagementProject.empServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.finalproject.EmployeeManagementProject.EmpRepository.EmployeeRepository;
import com.excelr.finalproject.EmployeeManagementProject.EmployeeDetails.EmployeeDetails;
import com.excelr.finalproject.EmployeeManagementProject.empResourceNotFound.EmployeeResourceNotFound;
import com.excelr.finalproject.EmployeeManagementProject.empService.EmployeeServices;

@Service
public class EmployeeServiceImp implements EmployeeServices{
	@Autowired
	private EmployeeRepository emprep;
	
	@Override
	public EmployeeDetails saveEmp(EmployeeDetails add) {
		add = emprep.save(add);
		return add;
	}

	@Override
	public List<EmployeeDetails> getAllEmp(EmployeeDetails emp) {
		
		return emprep.findAll();
	}

	@Override
	public EmployeeDetails updateEmp(EmployeeDetails add, int empcode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDetails delete(int empcode) {
		EmployeeDetails deleteemp = emprep.findById(empcode).orElseThrow(
				()-> new EmployeeResourceNotFound("Employee","id",empcode));
		emprep.deleteById(empcode);
		return deleteemp;
	}

}

package com.excelr.finalproject.EmployeeManagementProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.finalproject.EmployeeManagementProject.AdminDetails.AdminDetails;
import com.excelr.finalproject.EmployeeManagementProject.Services.AdminServices;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	@Autowired
	private AdminServices admin;
	
	@PostMapping("/save")
	public ResponseEntity<AdminDetails> saveAdmin(@RequestBody AdminDetails add){
		return new ResponseEntity<AdminDetails>(admin.saveAdmin(add),HttpStatus.OK);
	}
	
	@GetMapping("/getadminls")
	public List<AdminDetails> getAllAdmins(AdminDetails add){
		return admin.getAllAdmins(add);
	}
	
}

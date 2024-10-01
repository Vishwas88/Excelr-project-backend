package com.excelr.finalproject.EmployeeManagementProject.EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.finalproject.EmployeeManagementProject.EmployeeDetails.EmployeeDetails;
import com.excelr.finalproject.EmployeeManagementProject.empService.EmployeeServices;

@RestController
@RequestMapping("/api/admin/emp")
public class EmpController {

	@Autowired
	private EmployeeServices empservices;
	
	@PostMapping("/save")
	public ResponseEntity<EmployeeDetails> saveEmp(@RequestBody EmployeeDetails emp){
		return new ResponseEntity<EmployeeDetails>(empservices.saveEmp(emp),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<EmployeeDetails> delete(@PathVariable("id") int id)
	{
		return new ResponseEntity<EmployeeDetails>(empservices.delete(id),HttpStatus.OK);
	}
	
	@GetMapping("/getempls")
	public List<EmployeeDetails> getAllEmp(EmployeeDetails emp)
	{
		return empservices.getAllEmp(emp)
;	}
}

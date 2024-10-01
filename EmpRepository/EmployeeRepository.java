package com.excelr.finalproject.EmployeeManagementProject.EmpRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.finalproject.EmployeeManagementProject.EmployeeDetails.EmployeeDetails;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDetails,Integer>{

}

package com.excelr.finalproject.EmployeeManagementProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.finalproject.EmployeeManagementProject.AdminDetails.AdminDetails;

@Repository
public interface Repositoryy extends JpaRepository<AdminDetails, Integer> {

}

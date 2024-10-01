package com.excelr.finalproject.EmployeeManagementProject.EmployeeDetails;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class EmployeeDetails {
	@Id
	private int EmpCode;
	private String FullName;
	private Date dob;
	private String Gender;
	private int age;
	private long mobile;
	private String email;
	private String EmergencyContactName;
	private long EmergencyContactNumber;
	private String PCountry;
	private String PState;
	private String  PCity;
	private int Ppincode;
	private String Country;
	private String State;
	private String  City;
	private int Pincode;
	
	private String companyMail;
	private long officePhone;
	private String officecity;
	private int officePincode;
	private String officeState;
	private String officeCountry;
	private String reportingManagerEmpEmail;
	private String hrName;
	private Date dateOfJoining;
	private String employeeHistory;
	
	private String projectCode;
	private Date projectStartDate;
	private Date projectEndDate;
	private String  projectName;
	private String ProjectHistory;
	
	private String panCardNumber;
	private long AadharNumber;
	private String bankName;
	private String Branch;
	private String IFSC;
	private int ctc;
	
	
	public int getEmpCode() {
		return EmpCode;
	}
	public void setEmpCode(int empCode) {
		EmpCode = empCode;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmergencyContactName() {
		return EmergencyContactName;
	}
	public void setEmergencyContactName(String emergencyContactName) {
		EmergencyContactName = emergencyContactName;
	}
	public long getEmergencyContactNumber() {
		return EmergencyContactNumber;
	}
	public void setEmergencyContactNumber(long emergencyContactNumber) {
		EmergencyContactNumber = emergencyContactNumber;
	}
	public String getPCountry() {
		return PCountry;
	}
	public void setPCountry(String pCountry) {
		PCountry = pCountry;
	}
	public String getPState() {
		return PState;
	}
	public void setPState(String pState) {
		PState = pState;
	}
	public String getPCity() {
		return PCity;
	}
	public void setPCity(String pCity) {
		PCity = pCity;
	}
	public int getPpincode() {
		return Ppincode;
	}
	public void setPpincode(int ppincode) {
		Ppincode = ppincode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public String getCompanyMail() {
		return companyMail;
	}
	public void setCompanyMail(String companyMail) {
		this.companyMail = companyMail;
	}
	public long getOfficePhone() {
		return officePhone;
	}
	public void setOfficePhone(long officePhone) {
		this.officePhone = officePhone;
	}
	public String getOfficecity() {
		return officecity;
	}
	public void setOfficecity(String officecity) {
		this.officecity = officecity;
	}
	public int getOfficePincode() {
		return officePincode;
	}
	public void setOfficePincode(int officePincode) {
		this.officePincode = officePincode;
	}
	public String getOfficeState() {
		return officeState;
	}
	public void setOfficeState(String officeState) {
		this.officeState = officeState;
	}
	public String getOfficeCountry() {
		return officeCountry;
	}
	public void setOfficeCountry(String officeCountry) {
		this.officeCountry = officeCountry;
	}
	public String getReportingManagerEmpEmail() {
		return reportingManagerEmpEmail;
	}
	public void setReportingManagerEmpEmail(String reportingManagerEmpEmail) {
		this.reportingManagerEmpEmail = reportingManagerEmpEmail;
	}
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getEmployeeHistory() {
		return employeeHistory;
	}
	public void setEmployeeHistory(String employeeHistory) {
		this.employeeHistory = employeeHistory;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public Date getProjectStartDate() {
		return projectStartDate;
	}
	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	public Date getProjectEndDate() {
		return projectEndDate;
	}
	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectHistory() {
		return ProjectHistory;
	}
	public void setProjectHistory(String projectHistory) {
		ProjectHistory = projectHistory;
	}
	public String getPanCardNumber() {
		return panCardNumber;
	}
	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}
	public long getAadharNumber() {
		return AadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		AadharNumber = aadharNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public int getCtc() {
		return ctc;
	}
	public void setCtc(int ctc) {
		this.ctc = ctc;
	}
	
	
	
	
	

}

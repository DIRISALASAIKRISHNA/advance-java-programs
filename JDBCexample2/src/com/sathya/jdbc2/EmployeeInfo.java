package com.sathya.jdbc2;

public class EmployeeInfo {
	int empID;
	String empName;
	double Salary;
	public EmployeeInfo(int empID, String empName, double salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		Salary = salary;
		
	}
	@Override
	public String toString() {
		return "EmployeeInfo [empID=" + empID + ", empName=" + empName + ", Salary=" + Salary + "]";
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public EmployeeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}		
	
	



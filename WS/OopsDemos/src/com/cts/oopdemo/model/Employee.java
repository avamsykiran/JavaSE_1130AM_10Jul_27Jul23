package com.cts.oopdemo.model;

public class Employee {

	private int empId;
	private String fullName;
	private double salary;
	private double hra;
	private double netPay;
	
	public Employee(){
		
	}

	public Employee(int empId, String fullName, double salary) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getNetPay() {
		return netPay;
	}

	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}

	public String toString() {
		return "empId=" + empId + ", fullName=" + fullName
				+ ", salary=" + salary + ", hra=" + hra + ", netPay=" + netPay;
	}
	
	
}

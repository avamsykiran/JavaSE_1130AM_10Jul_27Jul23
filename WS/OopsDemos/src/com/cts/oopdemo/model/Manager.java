package com.cts.oopdemo.model;

public class Manager extends Employee {
	private double ta;
	
	public Manager(){
		
	}

	public Manager(int empId, String fullName, double salary) {
		super(empId, fullName, salary);
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	public String toString() {
		return super.toString() + ",ta=" + ta;
	}
	
	
}

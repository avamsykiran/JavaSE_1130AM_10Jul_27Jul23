package com.cts.oopdemo.model;

public class ContractEmployee extends Employee {
	private int contractDuration;
	
	public ContractEmployee(){
		
	}

	public ContractEmployee(int empId, String fullName, double salary,int contractDuration) {
		super(empId, fullName, salary);
		this.contractDuration = contractDuration;
	}

	public int getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(int contractDuration) {
		this.contractDuration = contractDuration;
	}

	public String toString() {
		return super.toString() + ",contractDuration=" + contractDuration;
	}
}

package com.cts.exceptionsdemo.model;

public class BankAccount {

	private String accNumber;
	private double balance;
	
	public BankAccount() {
		// TODO Auto-generated method stub

	}

	public BankAccount(String accNumber, double balance) {
		super();
		this.accNumber = accNumber;
		this.balance = balance;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}

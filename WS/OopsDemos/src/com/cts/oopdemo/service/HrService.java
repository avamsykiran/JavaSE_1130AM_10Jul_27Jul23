package com.cts.oopdemo.service;

import com.cts.oopdemo.model.Employee;
import com.cts.oopdemo.model.Manager;

public class HrService {

	public static final double HRA_PERCENT = 0.25;
	public static final double TA_PERCENT = 0.12;
	
	private double computeHra(double salary){
		return salary*HRA_PERCENT;
	}
	
	private double computeTa(double salary){
		return salary*TA_PERCENT;
	}
	
	public void compute(Employee emp){
		emp.setHra(computeHra(emp.getSalary()));
		emp.setNetPay(emp.getSalary()+emp.getHra());
	}
	
	public void compute(Manager mgr){
		mgr.setHra(computeHra(mgr.getSalary()));
		mgr.setTa(computeTa(mgr.getSalary()));
		mgr.setNetPay(mgr.getSalary()+mgr.getHra()+mgr.getTa());
	}

}

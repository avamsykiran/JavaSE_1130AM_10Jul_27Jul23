package com.cts.oopdemo;

import com.cts.oopdemo.model.CircularBoard;
import com.cts.oopdemo.model.ContractEmployee;
import com.cts.oopdemo.model.Employee;
import com.cts.oopdemo.model.Manager;
import com.cts.oopdemo.model.RectangularBoard;
import com.cts.oopdemo.service.AdEstimationService;
import com.cts.oopdemo.service.HrService;

public class App01 {

	public static void main(String[] args) {
		
		HrService hrService = new HrService();
	
		Employee emp1 = new Employee(101, "Vamsy", 45678.0);
		hrService.compute(emp1);
		System.out.println(emp1);
		
		ContractEmployee cemp1 = new ContractEmployee(102, "sagar", 35000.0, 5);
		hrService.compute(cemp1);
		System.out.println(cemp1);
		
		Manager mgr1 = new Manager(201, "Indhikaa",124900.0);
		hrService.compute(mgr1);
		System.out.println(mgr1);
		
		AdEstimationService adEstimationService = new AdEstimationService(10, 2);
		RectangularBoard rectBoard1 = new RectangularBoard(20, 40);
		CircularBoard cirBoard1 = new CircularBoard(10.4);
		System.out.println(adEstimationService.estiamtePaintingCost(rectBoard1));
		System.out.println(adEstimationService.estiamtePaintingCost(cirBoard1));
	}

}

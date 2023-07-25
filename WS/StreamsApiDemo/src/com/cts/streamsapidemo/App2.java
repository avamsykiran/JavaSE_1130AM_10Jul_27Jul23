package com.cts.streamsapidemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.cts.streamsapidemo.model.Employee;

public class App2 {
	public static void main(String args[]) {
		List<Employee> emps = new ArrayList<>();

		emps.add(new Employee(201, "Vamsy", 45000.0, false, LocalDate.now().minusYears(2)));
		emps.add(new Employee(215, "Zeenath", 55000.0, false, LocalDate.now().minusYears(1)));
		emps.add(new Employee(211, "Xavier", 46000.0, false, LocalDate.now().minusYears(2)));
		emps.add(new Employee(202, "Babloo", 77000.0, true, LocalDate.now().minusYears(4)));
		emps.add(new Employee(102, "Charles", 45000.0, false, LocalDate.now().minusYears(2)));
		emps.add(new Employee(101, "David", 15000.0, false, LocalDate.now().minusYears(2)));
		emps.add(new Employee(110, "Amrutha", 35000.0, false, LocalDate.now().minusYears(4)));
		emps.add(new Employee(109, "Bahrathi", 95000.0, true, LocalDate.now().minusYears(2)));
		emps.add(new Employee(106, "Sindhu", 85000.0, false, LocalDate.now().minusYears(5)));
		emps.add(new Employee(103, "Jaya", 49000.0, false, LocalDate.now().minusYears(3)));
		emps.add(new Employee(101, "Vinay", 39000.0, false, LocalDate.now().minusYears(6)));

		double totalSal=0;
		for(Employee emp:emps) {
			totalSal+=emp.getSalary();
		}
		System.out.println(totalSal);
		System.out.println("-------------------------------------------------------------------------------");
		
		totalSal = emps.stream().map(e -> e.getSalary()).reduce((s1,s2)->s1+s2).get();
		System.out.println(totalSal);
		System.out.println("-------------------------------------------------------------------------------");
		
		totalSal = emps.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println(totalSal);
		System.out.println("-------------------------------------------------------------------------------");
	
		double avgSal = emps.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
		System.out.println(avgSal);
		System.out.println("-------------------------------------------------------------------------------");
	
		Employee empWithMaxSal = emps.stream().reduce((e1,e2) -> e1.getSalary()>e2.getSalary()?e1:e2).orElse(null);
		System.out.println(empWithMaxSal);
		System.out.println("-------------------------------------------------------------------------------");
		
		List<String> allNames = emps.stream().map(Employee::getFullName).collect(Collectors.toList());
		System.out.println(allNames);
		System.out.println("-------------------------------------------------------------------------------");
		
		Employee seniorEmp = emps.stream().reduce((e1,e2) -> e1.getJoinDate().isBefore(e2.getJoinDate())?e1:e2).orElse(null);
		System.out.println(seniorEmp);
		System.out.println("-------------------------------------------------------------------------------");
		
	}
}

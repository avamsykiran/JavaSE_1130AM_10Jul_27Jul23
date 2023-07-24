package com.cts.utilsdemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cts.utilsdemo.model.Employee;

public class App5LambdaExpressions {

	public static void main(String[] args) {
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

		for(Employee emp : emps){
			System.out.println(emp);
		}
		System.out.println("---------------------------------------------------------------------------");
		
		Collections.sort(emps);

		for(Employee emp : emps){
			System.out.println(emp);
		}
		System.out.println("---------------------------------------------------------------------------");

		Comparator<Employee> cmp1 = (e1,e2) -> e1.getFullName().compareTo(e2.getFullName());
		Collections.sort(emps,cmp1);

		for(Employee emp : emps){
			System.out.println(emp);
		}
		System.out.println("---------------------------------------------------------------------------");


		Collections.sort(emps,(e1,e2) -> e1.getJoinDate().compareTo(e2.getJoinDate()));

		for(Employee emp : emps){
			System.out.println(emp);
		}
		System.out.println("---------------------------------------------------------------------------");

	}

}

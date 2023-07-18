package com.cts.utilsdemo;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

import com.cts.utilsdemo.comparators.EmployeeComparatorOnFullName;
import com.cts.utilsdemo.model.Employee;

public class App2 {

	public static void main(String[] args) {
		//Set<Employee> emps = new HashSet<>();
		//Set<Employee> emps = new LinkedHashSet<>();
		//Set<Employee> emps = new TreeSet<>();
		Set<Employee> emps = new TreeSet<>(new EmployeeComparatorOnFullName());
		
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
	}

}

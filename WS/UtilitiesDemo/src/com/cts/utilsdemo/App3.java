package com.cts.utilsdemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cts.utilsdemo.comparators.EmployeeComparatorOnFullName;
import com.cts.utilsdemo.comparators.EmployeeComparatorOnJoinDate;
import com.cts.utilsdemo.model.Employee;

public class App3 {

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

		Map<Integer,Integer> empsCountByYear = new TreeMap<>();
		Map<String,Integer> empsCount = new TreeMap<>();
		
		int contractEmps = 0;
		
		for(Employee emp : emps){
			
			if(emp.isContract()){
				contractEmps++;
			}
			
			int year = emp.getJoinDate().getYear();
			if(empsCountByYear.containsKey(year)){
				empsCountByYear.replace(year, empsCountByYear.get(year)+1);
			}else{
				empsCountByYear.put(year, 1);
			}
		}
		
		empsCount.put("Contract Employees", contractEmps);
		empsCount.put("Parminant Employees", emps.size()- contractEmps);
		
		System.out.println(empsCountByYear);
		System.out.println(empsCount);
		
		
	}

}

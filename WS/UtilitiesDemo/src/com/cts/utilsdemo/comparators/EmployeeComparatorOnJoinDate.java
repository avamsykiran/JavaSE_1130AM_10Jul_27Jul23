package com.cts.utilsdemo.comparators;

import java.util.Comparator;

import com.cts.utilsdemo.model.Employee;

public class EmployeeComparatorOnJoinDate implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getJoinDate().compareTo(o2.getJoinDate());
	}

}

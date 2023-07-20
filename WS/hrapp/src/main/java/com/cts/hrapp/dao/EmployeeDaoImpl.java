package com.cts.hrapp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cts.hrapp.exception.DataOperationFailedException;
import com.cts.hrapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private Map<Integer,Employee> empsMap;
	private int nextEmpId;

	public EmployeeDaoImpl() {
		this.empsMap = new TreeMap<>();
		this.nextEmpId=0;
	}

	@Override
	public Employee add(Employee employee) throws DataOperationFailedException {
		if(employee==null) {
			throw new DataOperationFailedException("No proepr employee record received to add");
		}
		
		employee.setEmpId(++this.nextEmpId);
		empsMap.put(employee.getEmpId(),employee);
		return employee;
	}

	@Override
	public void deleteById(int empId) throws DataOperationFailedException {
		if(!empsMap.containsKey(empId)){
			throw new DataOperationFailedException("No Such Employee Found To Delete");
		}
		empsMap.remove(empId);
	}

	@Override
	public Employee getById(int empId) throws DataOperationFailedException {
		Employee emp = empsMap.get(empId);
		if(emp==null) {
			throw new DataOperationFailedException("No Such Employee Found");
		}
		return emp;
	}

	@Override
	public List<Employee> getAll() throws DataOperationFailedException {
		return new ArrayList<>(empsMap.values());
	}

}

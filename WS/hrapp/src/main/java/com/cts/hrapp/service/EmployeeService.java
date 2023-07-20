package com.cts.hrapp.service;

import java.util.List;

import com.cts.hrapp.exception.DataOperationFailedException;
import com.cts.hrapp.model.Employee;

public interface EmployeeService {
	Employee add(Employee employee) throws DataOperationFailedException;
	void deleteById(int empId)  throws DataOperationFailedException;
	Employee getById(int empId)  throws DataOperationFailedException;
	List<Employee> getAll()  throws DataOperationFailedException;
}

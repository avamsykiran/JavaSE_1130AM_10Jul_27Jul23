package com.cts.hrapp.service;

import java.util.List;

import com.cts.hrapp.dao.EmployeeDao;
import com.cts.hrapp.dao.EmployeeDaoImpl;
import com.cts.hrapp.exception.DataOperationFailedException;
import com.cts.hrapp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		this.employeeDao = new EmployeeDaoImpl();
	}

	private String validate(Employee employee) {
		String errMsg=null;
		//...................
		return errMsg;
	}
	
	@Override
	public Employee add(Employee employee) throws DataOperationFailedException {
		String errMsg = validate(employee);
		if(errMsg!=null) {
			throw new DataOperationFailedException(errMsg);
		}
		return employeeDao.add(employee);
	}

	@Override
	public void deleteById(int empId) throws DataOperationFailedException {
		if(empId<=0){
			throw new DataOperationFailedException("Invalid Employee Id");
		}
		employeeDao.deleteById(empId);
	}

	@Override
	public Employee getById(int empId) throws DataOperationFailedException {
		if(empId<=0){
			throw new DataOperationFailedException("Invalid Employee Id");
		}
		return employeeDao.getById(empId);
	}

	@Override
	public List<Employee> getAll() throws DataOperationFailedException {
		return employeeDao.getAll();
	}

}

package com.cts.hrapp.service;

import java.time.LocalDate;
import java.util.List;

import com.cts.hrapp.dao.EmployeeDao;
import com.cts.hrapp.dao.EmployeeDaoIOStreamImpl;
import com.cts.hrapp.dao.EmployeeDaoImpl;
import com.cts.hrapp.exception.DataOperationFailedException;
import com.cts.hrapp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() throws DataOperationFailedException {
		//this.employeeDao = new EmployeeDaoImpl();
		this.employeeDao = new EmployeeDaoIOStreamImpl();
	}

	private String validate(Employee employee) {
		StringBuffer errMsgs = new StringBuffer();
		
		if(employee.getFullName().isEmpty()) {
			errMsgs.append("Full Name is a mandatory field!\n");
		}
		
		if(employee.getJoinDate()==null) {
			errMsgs.append("Join Date is a mandatory field!\n");
		}else if(employee.getJoinDate().isAfter(LocalDate.now())) {
			errMsgs.append("Join Date can not be a future date! \n");
		}
		
		if(employee.getSalary()<=0) {
			errMsgs.append("Salary can not be negaive!\n");
		}
		
		return errMsgs.length()==0? null:errMsgs.toString();
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

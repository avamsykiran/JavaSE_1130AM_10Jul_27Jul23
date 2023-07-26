package com.cts.hrapp.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cts.hrapp.exception.DataOperationFailedException;
import com.cts.hrapp.model.Employee;

public class EmployeeDaoJdbcImpl implements EmployeeDao {

	public static final String ADD_EMP_QRY = "insert into emps(fnm,sal,isc,jdt) values(?,?,?,?)";
	public static final String GET_EMP_ID_QRY = "select max(eid) from emps";
	public static final String DEL_EMP_QRY = "delete from emps where eid=?";
	public static final String GET_EMP_BY_ID_QRY = "select eid,fnm,sal,isc,jdt from emps where eid=?";
	public static final String GET_ALL_EMPS_QRY = "select eid,fnm,sal,isc,jdt from emps";
	
	private ConnectionProvider connectionProvider;
	
	public EmployeeDaoJdbcImpl() throws DataOperationFailedException {
		try {
			this.connectionProvider = ConnectionProvider.getInstance();
		} catch (IOException e) {
			throw new DataOperationFailedException("Unable to red the database connection proeprties!");
		}
	}
	
	@Override
	public Employee add(Employee employee) throws DataOperationFailedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int empId) throws DataOperationFailedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getById(int empId) throws DataOperationFailedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAll() throws DataOperationFailedException {
		// TODO Auto-generated method stub
		return null;
	}

}

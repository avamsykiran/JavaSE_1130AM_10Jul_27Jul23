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

public class EmployeeDaoIOStreamImpl implements EmployeeDao {

	public static final String FILE_NAME = "emps.data";

	private Map<Integer, Employee> empsMap;
	private int nextEmpId;

	public EmployeeDaoIOStreamImpl() throws DataOperationFailedException {
		this.nextEmpId = 0;
		readData();
	}

	private void readData() throws DataOperationFailedException {
		File file = new File(FILE_NAME);
		if (file.exists()) {
			try (ObjectInputStream fin = new ObjectInputStream(new FileInputStream(file))) {
				empsMap = (Map<Integer, Employee>) fin.readObject();
			} catch (IOException | ClassNotFoundException e) {
				throw new DataOperationFailedException("Can not read the file");
			}
		} else {
			empsMap = new TreeMap<>();
		}
	}

	private void writeData() throws DataOperationFailedException {
		try (ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			fout.writeObject(empsMap);
		} catch (IOException e) {
			throw new DataOperationFailedException("Can not read the file");
		}
	}

	@Override
	public Employee add(Employee employee) throws DataOperationFailedException {
		if (employee == null) {
			throw new DataOperationFailedException("No proepr employee record received to add");
		}

		employee.setEmpId(++this.nextEmpId);
		empsMap.put(employee.getEmpId(), employee);
		writeData();
		return employee;
	}

	@Override
	public void deleteById(int empId) throws DataOperationFailedException {
		if (!empsMap.containsKey(empId)) {
			throw new DataOperationFailedException("No Such Employee Found To Delete");
		}
		empsMap.remove(empId);
		writeData();
	}

	@Override
	public Employee getById(int empId) throws DataOperationFailedException {
		Employee emp = empsMap.get(empId);
		if (emp == null) {
			throw new DataOperationFailedException("No Such Employee Found");
		}
		return emp;
	}

	@Override
	public List<Employee> getAll() throws DataOperationFailedException {
		return new ArrayList<>(empsMap.values());
	}

}

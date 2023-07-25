package com.cts.hrapp.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.cts.hrapp.exception.DataOperationFailedException;
import com.cts.hrapp.model.Employee;
import com.cts.hrapp.service.EmployeeService;
import com.cts.hrapp.service.EmployeeServiceImpl;

public class EmployeeCrudOperations {

	public static final String dtFormat = "dd-MM-yyyy";
	
	private EmployeeService empService;
	private Scanner scan;
	
	public EmployeeCrudOperations(Scanner scan) throws DataOperationFailedException {
		this.empService = new EmployeeServiceImpl();
		this.scan=scan;
	}

	public void doAdd() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dtFormat);
		
		System.out.print("Full Name> ");
		String fullName = scan.next();
		System.out.print("Salary> ");
		double salary = scan.nextDouble();
		System.out.print("JoinDate> ");
		LocalDate joinDate = LocalDate.parse(scan.next(),formatter);
		System.out.print("IsContract Employee(true/false)> ");
		boolean isContract = scan.nextBoolean();
		
		Employee employee = new Employee(0,fullName,salary,isContract,joinDate);

		try {
			employee = empService.add(employee);
			System.out.println("Employee record is saved! with id "+employee.getEmpId());
		} catch (DataOperationFailedException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void doDelete() {
		System.out.print("Employee Id To Delete> ");
		int empId = scan.nextInt();
		
		try {
			empService.deleteById(empId);
			System.out.println("Employee record deleted!");
		} catch (DataOperationFailedException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void doSearch() {
		System.out.print("Employee Id To Search> ");
		int empId = scan.nextInt();
		
		try {
			Employee employee = empService.getById(empId);
			System.out.println(employee);
		} catch (DataOperationFailedException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void doList() {
		try {
			List<Employee> employees = empService.getAll();
			
			if(employees.isEmpty()) {
				System.out.println("No Records To Display!");
			}else {
				for(Employee employee:employees) {
					System.out.println(employee);
				}
			}
		} catch (DataOperationFailedException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void run() {
		Commands cmd = null;
		String commands = "";
		for(Commands c : Commands.values()) {
			commands += c +"|";
		}
		
		while(cmd!=Commands.QUIT) {
			System.out.println(commands +"> ");
			cmd = Commands.valueOf(scan.next().toUpperCase());
			
			switch(cmd){
				case ADD: doAdd(); break;
				case LIST:doList(); break;
				case SEARCH:doSearch();break;
				case DELETE:doDelete();break;
				case QUIT:System.out.println("Thank you!"); break;
			}
		}
		
	}
}

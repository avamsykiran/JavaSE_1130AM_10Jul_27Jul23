package com.cts.hrapp;

import java.util.Scanner;

import com.cts.hrapp.exception.DataOperationFailedException;
import com.cts.hrapp.ui.EmployeeCrudOperations;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			EmployeeCrudOperations empUI= new EmployeeCrudOperations(scan);
			empUI.run();
		} catch (DataOperationFailedException e) {
			System.out.println(e.getMessage());
		}
		
		
		scan.close();
	}

}

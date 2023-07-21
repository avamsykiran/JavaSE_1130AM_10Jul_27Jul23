package com.cts.hrapp;

import java.util.Scanner;

import com.cts.hrapp.ui.EmployeeCrudOperations;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		EmployeeCrudOperations empUI = new EmployeeCrudOperations(scan);
		empUI.run();
		
		scan.close();
	}

}

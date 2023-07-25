package com.cts.iostreamsdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.cts.iostreamsdemo.model.Employee;

public class App4ReadObjectsFromFile {

	public static void main(String[] args) {
		
		final String fileName = "emps.data";
		
		try(ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream(fileName))){
			List<Employee> emps = (List<Employee>) fileIn.readObject();
			emps.stream().forEach(System.out::println);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		

	}

}

package com.cts.datetimeapidemo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeApiDemoApp {

	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate today = LocalDate.now();
		LocalDate indiaIndependence = LocalDate.of(1947, Month.AUGUST, 15);
		Period period= Period.between(indiaIndependence, today);
		
		System.out.println(today.format(format));
		System.out.println(indiaIndependence.format(format));
		System.out.println(period);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dob (dd-MM-yyyy)? ");
		LocalDate dob = LocalDate.parse(scan.next(),format);
		
		Period age = Period.between(dob, today);
		System.out.println("You are " + (age.toTotalMonths()/12.0) +"yrs old");
		
		scan.close();
	}

}

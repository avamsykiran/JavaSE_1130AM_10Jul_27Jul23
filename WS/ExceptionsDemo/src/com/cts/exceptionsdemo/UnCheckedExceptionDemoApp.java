package com.cts.exceptionsdemo;

import java.util.Scanner;

public class UnCheckedExceptionDemoApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Number? ");
		while(!scan.hasNextInt()){
			scan.nextLine();
		}
		int n1 = scan.nextInt();
		System.out.println("Another Number? ");
		while(!scan.hasNextInt()){
			scan.nextLine();
		}
		int n2 = scan.nextInt();
		
		if(n2==0){
			System.out.println("0 is not a acceptable divisor.");
		}else{
			System.out.println(n1/n2);
		}
		
		scan.close();

	}

}

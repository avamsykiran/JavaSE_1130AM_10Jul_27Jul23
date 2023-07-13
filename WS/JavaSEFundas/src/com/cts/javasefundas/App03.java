package com.cts.javasefundas;

import java.util.Scanner;

import com.cts.javasefundas.model.ComplexNumber;

public class App03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("A String? ");
		String str = scan.nextLine();
		
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		
		System.out.println(rev);
		
		if(str.equalsIgnoreCase(rev)){
			System.out.println("Its Pallendrome");
		}else{
			System.out.println("Not a Pallendrome");
		}
		
		scan.close();
	}

}

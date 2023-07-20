package com.cts.utilsdemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App4RegExpDemo {

	public static void main(String[] args) {
		
		String mobileRegExp = "[1-9][0-9]{9}";
		
		Pattern mobilePattern = Pattern.compile(mobileRegExp);
		
		Scanner scan = new Scanner(System.in);
		
		String mno=null;
		
		while(!"quit".equalsIgnoreCase(mno)){
			System.out.print("Mobile Number/quit? ");
			mno = scan.next();
			Matcher mobileMatcher = mobilePattern.matcher(mno);
			System.out.println(mobileMatcher.matches()?"Valid Mobile Number":"Invalid Mobile Number");
		}
		
		scan.close();
	}

}

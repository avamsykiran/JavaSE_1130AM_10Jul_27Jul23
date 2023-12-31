package com.cts.exceptionsdemo;

import java.util.Scanner;

import com.cts.exceptionsdemo.exception.DepositeException;
import com.cts.exceptionsdemo.exception.WithdrawException;
import com.cts.exceptionsdemo.model.BankAccount;
import com.cts.exceptionsdemo.service.BankingService;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount("SB10011",5600);
		BankingService bankingService = new BankingService();
		
		Scanner scan = new Scanner(System.in);
		
		double amt =0;
		
		String cmd = null;
		
		while(!"quit".equals(cmd)){
			System.out.print("Command (deposite/withdraw/balance/quit) > ");
			cmd = scan.next().toLowerCase();
			
			switch(cmd){
			case "balance":
				System.out.println(acc.getBalance());
				break;
			case "deposite":
				System.out.print("Amount> ");
				amt = scan.nextDouble();
				try {
					bankingService.deposite(acc, amt);
					System.out.println("Deposited!");
				} catch (DepositeException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "withdraw":
				System.out.print("Amount> ");
				amt = scan.nextDouble();
				try {
					bankingService.withdraw(acc, amt);
					System.out.println("Withdrawn!");
				} catch (WithdrawException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "quit":
				System.out.println("OK Bye");
				break;
			default:
				System.out.println("Invalid Option");
			}
		}
		
		scan.close();
	}

}

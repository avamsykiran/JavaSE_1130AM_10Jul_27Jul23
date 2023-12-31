package com.cts.exceptionsdemo.service;

import com.cts.exceptionsdemo.exception.DepositeException;
import com.cts.exceptionsdemo.exception.WithdrawException;
import com.cts.exceptionsdemo.model.BankAccount;

public class BankingService {

	public void deposite(BankAccount acc,double amt) throws DepositeException{
		if(acc!=null){
			if(amt<0){
				throw new DepositeException("Invalid Amount! Amount can not be negative");
			}
			acc.setBalance(acc.getBalance()+amt);
		}
	}

	public void withdraw(BankAccount acc,double amt) throws WithdrawException{
		if(acc!=null){
			if(amt<0){
				throw new WithdrawException("Invalid Amount! Amount can not be negative");
			}
			if(amt>acc.getBalance()){
				throw new WithdrawException("Insifficient Balance! Can not Withdraw!");
			}
			acc.setBalance(acc.getBalance()-amt);
		}
	}

}

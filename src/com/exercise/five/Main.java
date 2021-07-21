package com.exercise.five;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<BankAccount> bankArray = new ArrayList<>();
		bankArray.add(new BankAccount("Abisheak"));
		bankArray.add(new BankAccount("Sanjay"));
		bankArray.add(new BankAccount("Akshaya"));
		BankArray ICICI = new BankArray(bankArray, "ICICI");
		
		
		
		try {	System.out.println(ICICI.getBalance("453670101"));	}
		catch (InvalidAccountException e2) { System.out.println(e2.getMsg());	}
		
		
		
		
		
		try {	System.out.println(ICICI.getBalance("45367000"));	}
		catch (InvalidAccountException e2) {	System.out.println(e2.getMsg());;	}
		
		
		System.out.println(ICICI.depositMoney("45367001", 200));
		
		
		try {
			System.out.println(ICICI.getBalance("45367001"));
		} catch (InvalidAccountException e1) {
			System.out.println(e1.getMsg());
		}
		
		
		
		
		try {
			ICICI.transferMoney("45367001", "45367000", 5100);
		} catch (InvalidAccountException | Insufficinetbalance e1) {
			System.out.println("Insufficent balance or Account not found" );

		} 
		
		
		
		
		
		try {	System.out.println(ICICI.checkAccount("45367001"));	}
		catch (InvalidAccountException e) {	e.printStackTrace();	}
		try {	System.out.println(ICICI.checkAccount("45367000"));	} 
		catch (InvalidAccountException e) {	e.getMsg();	}
		
		
	
	}

}

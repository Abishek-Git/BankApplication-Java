package com.exercise.five;

public class BankAccount{
	private static int initial = 45367000;
	private int accNo;
	private String name;
	private double balance;
	
	public BankAccount(String name) {
		super();
		this.accNo = initial++;
		this.name = name;
		this.balance = 1000;
	}
	
	public BankAccount() {
		super();
	}

	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	



	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", Holder name=" + name + ", Balance=" + balance + "]";
	}
	
	
	

}

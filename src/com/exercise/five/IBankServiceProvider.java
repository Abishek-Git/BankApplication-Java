package com.exercise.five;
public interface IBankServiceProvider {
	public String checkAccount(String accNo) throws InvalidAccountException;
	public String getBalance(String accNo) throws InvalidAccountException;
	public boolean depositMoney(String accNo, double balance);
	public boolean withdrawMoney(String accNo, double balance)  throws Insufficinetbalance,InvalidAccountException;
	public boolean transferMoney(String fromAcc, String toAcc, double balance) throws InvalidAccountException,Insufficinetbalance;
}

package com.exercise.five;

import java.util.ArrayList;
public class BankArray extends InvalidAccountException implements IBankServiceProvider {
	private ArrayList<BankAccount> bankArray = new ArrayList<>();
	private String bankName = new String();
	private BankAccount foundAccount = new BankAccount();
	private BankAccount toAccount = new BankAccount();
	private BankAccount fromAccount = new BankAccount();
	
	public BankArray(ArrayList<BankAccount> bankArray, String bankName) {
		super();
		this.bankArray = bankArray;
		this.bankName = bankName;
	}
	
	public ArrayList<BankAccount> getBankArray() {
		return bankArray;
	}
	public void setBankArray(ArrayList<BankAccount> bankArray) {
		this.bankArray = bankArray;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String checkAccount(String accNo) throws InvalidAccountException {
		boolean foundFlag = false;
		for (BankAccount a: bankArray) {
			if(a.getAccNo() == Integer.parseInt(accNo)) {
				foundAccount = a;
				foundFlag = true;
			}
		}
		if (foundFlag)
			return foundAccount.toString();
		else
			throw new InvalidAccountException("Account Not Found");
	}
	
	public String getBalance(String accNo) throws InvalidAccountException {
		boolean foundFlag = false;
		for (BankAccount a: bankArray) {
			if(a.getAccNo() == Integer.parseInt(accNo)) {
				foundAccount = a;
				foundFlag = true;
			}
		}
		if (foundFlag)
			return String.valueOf(foundAccount.getBalance());
		else
			throw new InvalidAccountException("Account not found");
	}
	
	
	public boolean depositMoney(String accNo, double balance) {
			boolean foundDepositFlag = false;
			double temp;
			for (BankAccount a: bankArray) {
				if(a.getAccNo() == Integer.parseInt(accNo)) {
					foundAccount = a;
					foundDepositFlag = true;
				}
			}
			if (foundDepositFlag) {
				temp = foundAccount.getBalance() + balance;
				foundAccount.setBalance(temp);
				return foundDepositFlag;
			}
			else
				return foundDepositFlag;
		}
	
	
	public boolean withdrawMoney(String accNo, double balance) throws Insufficinetbalance,InvalidAccountException{
		boolean foundWithdrawFlag = false;
		double temp;
		foundAccount = null;
		for (BankAccount a: bankArray) {
			if(a.getAccNo() == Integer.parseInt(accNo)) {
				foundAccount = a;
				foundWithdrawFlag = true;
			}
		}
		if(foundAccount == null) {
			throw new InvalidAccountException("Account not found");
		}
		if (foundWithdrawFlag) {
			if (foundAccount.getBalance() > balance) {
				temp = foundAccount.getBalance() - balance;
				foundAccount.setBalance(temp);
				return foundWithdrawFlag;
			}
			else {
				throw new Insufficinetbalance("Insufficient balance");
			}
		}
		else
			return foundWithdrawFlag;
	}
	
	public boolean transferMoney(String fromAcc, String toAcc, double balance) throws InvalidAccountException,Insufficinetbalance {
		boolean fromFoundFlag = false;
		boolean toFoundFlag = false;
		boolean transferDone = false;
		double temp;
		for (BankAccount a: bankArray) {
			if(a.getAccNo() == Integer.parseInt(fromAcc)) {
				fromAccount = a;
				fromFoundFlag = true;
			}
		}
		if(!fromFoundFlag) { throw new InvalidAccountException("From Account not Found");	}
		for (BankAccount a: bankArray) {
			if(a.getAccNo() == Integer.parseInt(toAcc)) {
				toAccount = a;
				toFoundFlag = true;
			}
		}
		if(!toFoundFlag) { throw new InvalidAccountException("To Account not Found");	}
		if (fromFoundFlag && toFoundFlag ) {
			if (fromAccount.getBalance() > balance) {
				temp = fromAccount.getBalance() - balance;
				fromAccount.setBalance(temp);
				transferDone = true;
				temp = toAccount.getBalance() + balance;
				toAccount.setBalance(temp);
				return true;
				}
			else
				throw new Insufficinetbalance("Balance is Insufficient");
			}
		if (fromFoundFlag || toFoundFlag || transferDone)
			return false;
		else
			return true;
	}
}




















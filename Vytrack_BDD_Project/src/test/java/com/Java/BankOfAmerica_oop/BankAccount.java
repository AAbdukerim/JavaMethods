package com.Java.BankOfAmerica_oop;

public abstract class BankAccount {
	
	private String accountName;
	private long accountNumber;
	
	public String getAccountName() {
		return accountName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	//two arg constructor 
	public BankAccount(String accountName,long accountNumber) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		
	}
	
	
	
	//no arg constructor
	public BankAccount() {
		this.accountName = "No Content";
		this.accountNumber = 0;
		
	}
	
	// abstract methods
	public abstract void withdraw(double amount);
	public abstract void deposite(double amount);
	
	
	
	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", accountNumber=" + accountNumber + "]";
	}

	
	
}

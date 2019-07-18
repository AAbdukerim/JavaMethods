package com.Java.BankOfAmerica_oop;

public class SavingAccount extends BankAccount {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//three arg constructor
	public SavingAccount(String accountName,long accountNumber, double balance) {
		super(accountName, accountNumber);
		this.balance = balance;
	}
	//no arg constructor
	public SavingAccount() {
		super();
		this.balance= 0;
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		this.balance -= (amount * 0.1) + balance;

	}

	@Override
	public void deposite(double amount) {
		// TODO Auto-generated method stub
		this.balance += (amount * 0.1) + balance;

	}

	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + "|Account Name" + super.getAccountName() + "| account number"
				+ super.getAccountNumber() + "]";
	}

}

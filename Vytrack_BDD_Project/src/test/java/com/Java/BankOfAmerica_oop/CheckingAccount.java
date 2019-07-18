package com.Java.BankOfAmerica_oop;

public class CheckingAccount extends BankAccount {

	private double balance;

	public CheckingAccount() {
		super();
		this.balance = 0;

	}
	
	//three arg constructor
	public CheckingAccount(String accountName, long accountNumber, double balance) {
		super(accountName, accountNumber);
		this.balance = balance;
		System.out.println("Checking account three arg constructor is running");
	}
	
	
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void withdraw(double amount) {
		this.balance -= amount;

	}

	@Override
	public void deposite(double amount) {
		this.balance += amount;

	}

	@Override
	public String toString() {
		return "CheckingAccount [balance=" + balance + "|Account Name: " + super.getAccountName() + "| account number: "
				+ super.getAccountNumber() + "]";
	}

}

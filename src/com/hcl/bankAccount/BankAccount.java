package com.hcl.bankAccount;

public class BankAccount {
	int accountId; 
	String name;
	private int balance;
	
	// Constructors 
	BankAccount(){
	};	
	// set initial deposit
	BankAccount(int accountId, String name, int initialDeposit){
		
		this.accountId = accountId;
		this.name = name;
		setBalance(initialDeposit);		
	}
	
	// method to withdraw from balance
	
	public void withdraw(int amount){
		
		if (balance >= 0 ) {
		balance -= amount;
		System.out.println("You have withdrawn: $" + amount + "\nYour current balance is:" + balance);
		} 		
	}
	
	// method to deposit from balance
	public void deposit(int amount) {

		balance += amount;
		System.out.println("You have deposited: $" + amount + "\nYour current balance is: " + balance);
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	

}

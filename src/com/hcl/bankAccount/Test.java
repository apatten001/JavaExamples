package com.hcl.bankAccount;

import java.util.Scanner;

public class Test {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			// get account information
			System.out.println("Please enter an Id: \n");
			int id = sc.nextInt();
			
			System.out.println("Please enter your Name");
			String name = sc.next();
			
			// checks if name is greater than 15 characters
			while(true) {
				if (name.length() > 15) {
					
					System.out.println("Please enter a name less than 15 characters");
					name = sc.next();
				}
				break;
			}
			
			
			System.out.println("Please enter an initial balance to depsoit: \n");
			int initialDeposit = sc.nextInt();
			
			
			// Create instance of a bank account
			BankAccount myAccount = new BankAccount(id, name,  initialDeposit);
			
			
			// request a withdrawal amount until acccount is less than zero
			while(myAccount.getBalance() >= 0) {
				
				System.out.println("Enter a amount to withdrawal: $");
				
				int withdrawAmount = sc.nextInt();
				
				myAccount.withdraw(withdrawAmount);
				
			
			// throw exception if balance is less than zero
			if (myAccount.getBalance() < 0) {
				
				throw new InSufficentBalance();			
			} 
			}
		}catch (InSufficentBalance e){
			
			System.out.println(e);		
			
		// close scanner	
		}finally {
			sc.close();
		}
		
		

	}

}

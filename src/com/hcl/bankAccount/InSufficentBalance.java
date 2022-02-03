package com.hcl.bankAccount;

public class InSufficentBalance extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	InSufficentBalance(){
		
		System.out.println("Insufficient Balance Exception Thrown");
		
	}
	
	
	public String toString() {
		
		return " You have an insufficient balance.";
	}

}

package com.hcl.backend;

public class MarksException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarksException() {
		System.out.println("MarksException has been thrown.");
	}
	
	public String toString() {
		
		return "You have entered a mark that is outside the range 0-100.";
	}

}

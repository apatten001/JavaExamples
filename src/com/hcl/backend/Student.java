package com.hcl.backend;

import java.util.Scanner;

public class Student {
	
	int studentId;
	String name;
	int marks;
	
	Student(int studentId, String name, int marks){
		
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}

	public static void main(String[] args) {
		// Create new scanner
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
			// Create student object from input
			System.out.println("Enter a Student Id: ");
			int studentId = sc.nextInt();
			System.out.println("Enter a Name: ");
			String name = sc.next();
			System.out.println("Enter marks: ");
			int marks = sc.nextInt();
			
			Student john = new Student(studentId, name, marks);
			
			if (john.marks < 0 || john.marks >100) {
				throw new MarksException();
			}
		}catch(MarksException e){
			
			System.out.println(e);
		
		} finally {
			
			
			sc.close();
		}

	}

}

package com.hcl.employee;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		
		Employee chuck = new Employee(1, "Chuck", "Brooklyn");
		Employee axel = new Employee(2, "Axel", "Claymont");
		Employee chase = new Employee(3, "Chase", "Newark");
		
		empList.add(chuck);
		empList.add(axel);
		empList.add(chase);
		
		for(Employee e: empList) {
			
			System.out.println("id: "+ e.id + " name: "+ e.name +" city: " + e.city);
		}
		
		

	}

}

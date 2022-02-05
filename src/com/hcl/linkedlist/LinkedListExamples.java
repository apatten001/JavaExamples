package com.hcl.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars + "\n");

		// add first and last
		cars.addFirst("Nissan");
		cars.addLast("Honda");

		System.out.println(cars + "\n");

		// remove from head and tail of the list
		cars.removeFirst();
		System.out.println(cars + "\n");
		cars.removeLast();
		System.out.println(cars + "\n");

		// get the first value get the last value of linked list

		System.out.println(cars.getFirst() + "\n");
		System.out.println(cars.getLast() + "\n");
	}
}
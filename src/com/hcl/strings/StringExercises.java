package com.hcl.strings;

import java.util.StringTokenizer;

public class StringExercises {

	public static void main(String[] args) {
		

		StringBuffer sb = new StringBuffer("ArnoldJefferyPatten");
		// insert spaces between first middle and last name
		sb.insert(6, " ");
		sb.insert(14, " ");

		System.out.println(sb);
		System.out.println();

		sb.replace(6, 7, ":");
		sb.replace(14, 15, ":");

		System.out.println(sb);
		System.out.println();

		// append addition info to the string
		String date = "07/05/2022";
		sb.append(date);

		System.out.println(sb);
		System.out.println();

		// create StringTokenizer
		StringTokenizer st = new StringTokenizer("Arnold:Jeffery:Patten", ":");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextElement());
		}

		// create date StringTokenizer to break up the date
		StringTokenizer date2 = new StringTokenizer("07/05/22", "/");

		System.out.println();
		System.out.println("Month: " + date2.nextToken());
		System.out.println("Day: " + date2.nextToken());
		System.out.println("Year: " + date2.nextToken());

	}

}

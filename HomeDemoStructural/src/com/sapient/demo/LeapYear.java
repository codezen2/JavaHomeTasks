package com.sapient.demo;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Year to check for leap year");
		int y = scan.nextInt();
		leapcheck(y);
		scan.close();
	}

	public static void leapcheck(long year) {
		if (year % 4 == 0) {
			System.out.println(year + " is a Leap year.");
		} else if (year % 100 == 0) {
			System.out.println(year + " is not a Leap year.");
		} else if (year % 400 == 0) {
			System.out.println(year + " is a Leap year.");
		} else {
			System.out.println(year + " is not a Leap year.");
		}
	}

}

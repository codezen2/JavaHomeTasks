package com.sapient.service;

public class Leap {
	private long year;
	
	public long getYear() {
		return year;
	}
	public void setYear(long year) {
		this.year = year;
	}
	public void leapcheck() {
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

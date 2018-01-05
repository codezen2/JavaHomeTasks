package com.sapient.service;

public class PallindromeString extends Pallindrome {
	private String[] arr;

	public PallindromeString(String[] arr) {
		super();
		this.arr = arr;
	}

	public void pallincheck() {
		for (int i = 0; i < arr.length; i++) {
			setStr(arr[i]);
			System.out.println(arr[i] + " is a Pallindrome: " + checkPalindrome());
		}
	}

}

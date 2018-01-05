package com.sapient.service;

public class Pallindrome {
	private String str;

	public boolean checkPalindrome() {
		return str.equals(new StringBuilder(str).reverse().toString());

	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}

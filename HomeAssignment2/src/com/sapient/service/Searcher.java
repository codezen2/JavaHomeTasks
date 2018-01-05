package com.sapient.service;

public class Searcher {
	private String[] arr = { "aaa", "baa", "caa", "daa", "eaa", "faa" };

	public void display() {
		System.out.println("Data is:");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public String[] getArr() {
		return arr;
	}

	public int findItem(String str) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contentEquals(str)) {
				System.out.println("Found At :" + i + " :" + arr[i]);
				break;
			} else {
				System.out.println("Not Found");
			}
		}
		return 1;

	}
}

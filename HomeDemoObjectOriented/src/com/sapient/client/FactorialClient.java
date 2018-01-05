package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Factorial;

public class FactorialClient {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number for Factorial");
		int n=scan.nextInt();
		
		Factorial fac=new Factorial();
		try {
			fac.setNum(n);
			System.out.println(n +"'s Factorial is "+fac.fac());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}

package com.sapient.demo;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	       System.out.print("Enter a number: ");
	       int n = scan.nextInt(); 
	       String fact = fac(n);
	       System.out.println("Factorial is " + fact);
	}
	public static String fac(int n)
	{
		  BigInteger fact = new BigInteger("1");
	       for (int i = 1; i <= n; i++) {
	           fact = fact.multiply(new BigInteger(i + ""));
	       }
	       return fact.toString();
	}

}

package com.sapient.demo;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number to check for amstrong");
		int n=scan.nextInt();
		armstrongNum(n);
		scan.close();
		
	}

	public static void armstrongNum(int num) {
		int c = 0, a, temp;
		temp = num;
		while (num > 0) {
			a = num % 10;
			num = num / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println(temp + " is an Armstrong number");
		else
			System.out.println(temp + " is not an armstrong number");
	}
}

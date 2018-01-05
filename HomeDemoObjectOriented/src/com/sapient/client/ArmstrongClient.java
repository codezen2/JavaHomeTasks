package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.ArmstrongNum;

public class ArmstrongClient {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to check for armstrong number");
		int n=scan.nextInt();
		ArmstrongNum arm=new ArmstrongNum();
		try {
			arm.setNum(n);
			arm.armstrongNum();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		scan.close();
		
	}

}

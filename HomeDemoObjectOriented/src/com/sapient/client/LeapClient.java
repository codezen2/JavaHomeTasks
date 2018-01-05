package com.sapient.client;

import java.util.Scanner;
import com.sapient.service.Leap;

public class LeapClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Year to check for leap year");
		int y = scan.nextInt();
		Leap leap=new Leap();
		leap.setYear(y);
		leap.leapcheck();		
		scan.close();
		
	}

}

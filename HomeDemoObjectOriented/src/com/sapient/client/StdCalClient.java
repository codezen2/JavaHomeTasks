package com.sapient.client;

import com.sapient.service.StdCalculator;

public class StdCalClient {

	public static void main(String[] args) {
		
			StdCalculator cal=new StdCalculator();
			cal.setNum(10);
			cal.setNum2(20);
			System.out.println(cal.sum());
			System.out.println(cal.mul());
			System.out.println(cal.div());
			System.out.println(cal.mod());
			System.out.println(cal.convert2Bin());
			System.out.println(cal.convert2Oct());
			System.out.println(cal.convert2Hex());

	}

}

package com.sapient.service;

import java.math.BigInteger;

public class Factorial {
	private int num;
	
	public void setNum(int num) throws Exception {
		if(num<=0)
			throw new Exception("Num should be greatr than 0");
		this.num = num;
	}

	public String fac()
	{
		  BigInteger fact = new BigInteger("1");
	       for (int i = 1; i <= num; i++) {
	           fact = fact.multiply(new BigInteger(i + ""));
	       }
	       return fact.toString();
	}
}

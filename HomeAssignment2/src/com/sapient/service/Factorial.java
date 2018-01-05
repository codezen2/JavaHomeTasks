package com.sapient.service;

import java.math.BigInteger;

public class Factorial {
	private int x;
	
	
	public void setX(int x) {
		this.x = x;
	}


	public BigInteger doFact()
	{
		BigInteger fac=BigInteger.ONE;
		for(int i=1;i<=x;i++)
		{
			fac=fac.multiply(BigInteger.valueOf(i));
		}
		return fac;
	}
	
}

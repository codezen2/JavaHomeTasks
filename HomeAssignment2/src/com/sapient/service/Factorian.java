package com.sapient.service;

import java.math.BigInteger;

public class Factorian extends Factorial{

	private int num;

	public Factorian(int num) {
		super();
		this.num = num;
	}
	
	public BigInteger findFactorian()
	{
		int temp=num;
		BigInteger fac=BigInteger.ZERO;
		while(temp>0)
		{
			setX(temp%10);
			fac=fac.add(doFact());
			temp=temp/10;
		}
		return fac;
		
	}
	
}

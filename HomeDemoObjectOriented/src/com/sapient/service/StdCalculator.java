package com.sapient.service;

public class StdCalculator extends NumConversion {
	private int num2;	
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int sum(){
		return num2+getNum();
	}
	public int mul()
	{
		return num2*getNum();
	}
	public int sub(){
		return num2-getNum();
	}
	public int div()
	{
		return num2/getNum();
	}
	public int mod()
	{
		return Math.floorMod(num2, getNum());
	}
}

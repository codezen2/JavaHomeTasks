package com.sapient.service;

public class NumConversion {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public String convert2Oct()
	{
	return Integer.toOctalString(num);
	}
	public String convert2Hex()
	{
	return Integer.toHexString(num);
	}
	public String convert2Bin()
	{
	return Integer.toBinaryString(num);
	}
}

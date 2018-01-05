package com.sapient.service;

public class ArmstrongNum {
	private int num;

	public void setNum(int num) throws Exception {
		if (num < 0)
			throw new Exception("Not a valid number");
		this.num = num;
	}

	public void armstrongNum() {
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

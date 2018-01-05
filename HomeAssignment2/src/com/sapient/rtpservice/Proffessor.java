package com.sapient.rtpservice;

public class Proffessor extends Employee {
	private int rating;
	
	public Proffessor(int empId, String ename, int rating) {
		super(empId, ename);
		this.rating = rating;
	}

	@Override
	public void isoutstanding() {
		if(rating>=5)
		{
			System.out.println("Yes you are Outstanding");
		}else
		{
			System.out.println("Yes you are not Outstanding");
		}
	}

}

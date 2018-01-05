package com.sapient.rtpservice;

public class Trainee extends Employee {
	
	private double per;
	public Trainee(int empId, String ename,double per) {
		super(empId, ename);
		this.per=per;
	}

	@Override
	public void isoutstanding() {
		if(per<=90)
		{
			System.out.println("Yes you are Outstanding");
		}else
		{
			System.out.println("Yes you are not Outstanding");
		}
	}
	
}

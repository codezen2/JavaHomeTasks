package com.sapient.rtpservice;

public abstract class Employee {
	private int empId;
	private String ename;
	public Employee(int empId, String ename) {
		super();
		this.empId = empId;
		this.ename = ename;
	}
	public void display()
	{
		System.out.println("Id:"+empId+" Namw:"+ename);
	}
	public abstract void isoutstanding();
	
}

package com.sapient.service;

public class Employee {
	private int eid;
	private String ename;
	private double sal;
	private double pf;
	private double da;

	public Employee(int eid) throws Exception {
		super();
		if (eid < 1000)
			throw new Exception("Employee Id must be greator than 1000");
		this.eid = eid;
	}

	public Employee(int eid, String ename) throws Exception {
		this(eid);
		if (ename.contains("[a-zA-z]{3,20}"))
			throw new Exception("Employee Id mustb be greator than 1000");
		this.ename = ename;
	}

	public Employee(int eid, String ename, double sal) throws Exception {
		this(eid, ename);
		if (sal < 5000)
			throw new Exception("Salary must be greator than 5000");
		this.sal = sal;
		calcDa();
		calcPf();
	}

	private void setSal(double sal) {
		this.sal = sal;
	}

	private void setPf(double pf) {
		this.pf = pf;
	}

	private void calcDa() {
		if (sal <= 10000)
			da = 1000;
		else if (sal <= 20000 && sal > 10000)
			da = 2000;
		else if (sal <= 30000 && sal > 20000)
			da = 3000;
		else
			da=5000;
	}

	private void calcPf() {
		if (sal <= 10000)
			pf = 1000;
		else if (sal <= 20000 && sal > 10000)
			pf = 2000;
		else if (sal <= 30000 && sal > 20000)
			pf = 3000;
		else
			pf=5000;
	}
	public void display()
	{
		System.out.println("Employee Details are: ID: "+eid+" Name "+ename+" Salary "+sal+" PF: "+ pf+" " + " DA: "+da+" Net Salary "+ (sal-pf-da));
	}
}

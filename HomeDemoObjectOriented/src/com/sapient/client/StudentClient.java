package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Employee;

public class StudentClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id");
		int id = scan.nextInt();
		System.out.println("Enter Name");
		String name = scan.next();
		System.out.println("Enter Salary");
		double sal = scan.nextDouble();
		Employee emp;
		try {
			emp = new Employee(id, name, sal);
			emp.display();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		scan.close();
	}
}

package com.sapient.client;

import com.sapient.rtpservice.Employee;
import com.sapient.rtpservice.Proffessor;
import com.sapient.rtpservice.Trainee;

public class EmpClient {

	public static void main(String[] args) {
		Employee[] e = new Employee[5];
		e[0] = new Proffessor(1001, "raj", 5);
		e[1] = new Proffessor(1002, "kuamr", 8);
		e[2] = new Proffessor(1003, "khan", 2);
		e[3] = new Trainee(1001, "raj", 95);
		e[4] = new Proffessor(1002, "kaml", 52);
		e[0].isoutstanding();
		e[1].isoutstanding();
		e[2].isoutstanding();
		e[3].isoutstanding();
		e[4].isoutstanding();
		

	}

}

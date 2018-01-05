package com.sapient.client;

import com.sapient.service.Factorian;

public class FacClient {

	public static void main(String[] args) {
		Factorian fac=new Factorian(45);
		System.out.println("Fac:"+fac.findFactorian());
	}

}

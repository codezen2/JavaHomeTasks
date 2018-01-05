package com.sapient.client;

import com.sapient.service.SearcherNew;

public class SerClient {

	public static void main(String[] args) {
		SearcherNew sr = new SearcherNew();
		sr.display();
		System.out.println(sr.findItem(2));
		System.out.println("FOUND AT:"+sr.findItem("aaa"));
		System.out.println( sr.findItem(4));

	}

}

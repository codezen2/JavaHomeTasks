package com.sapient.service;

public class SearcherNew extends Searcher {

	@Override
	public int findItem(String str) {
		return super.findItem(str);
	}
	public String findItem(int index) {
		
		String[] arr=getArr();	
		if(index<0 || index>arr.length)
		{
			return "NOT FOUND";
		}else
		return arr[index];
	}
		
		
}

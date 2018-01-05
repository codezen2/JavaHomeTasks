package com.sapient.client;

import com.sapient.service.Pallindrome;
import com.sapient.service.PallindromeString;

public class PalindromeClient {

	public static void main(String[] args) {
		String[] str={"aaa","bbb","ccc","asds","asdasd"};
		PallindromeString p=new PallindromeString(str);
		p.setStr("tads");
		p.pallincheck(); 
	}

}

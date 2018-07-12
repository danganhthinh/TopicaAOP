package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SumString {
	public SumString() {
		
	}
	
	public String sum(String astr, String bstr) {
		int a = Integer.parseInt(astr);
		int b = Integer.parseInt(bstr);
		int sum = a + b;
		String s = String.valueOf(sum);
		return s;
	}
}

package com.TDD.calculator;

public class Calculator {
	public int add(String s) {
		String ar[]=s.split("[\\n,]+");
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum+=Integer.parseInt(ar[i]);
		}
		return sum;
	}
}

package com.TDD.calculator;

public class Calculator {
	public int add(String s) {
		String ar[]=s.split(",");
		int num1 = Integer.parseInt(ar[0]);
		int num2 = Integer.parseInt(ar[1]);
		return num1+num2;
	}
}

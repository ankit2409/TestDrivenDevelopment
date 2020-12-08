package com.TDD.calculator;

import java.util.Arrays;

public class Calculator {
	public int add(String s) {
		String ar[]=null;
		System.out.println(s.charAt(4));
		if (s.charAt(0)=='/' && s.charAt(1)=='/' &&s.charAt(3)=='\n') {
			String n = s.substring(4);
			ar = n.split(Character.toString(s.charAt(2)));
		}else {
			ar = s.split("[\\n,]+");}
		System.out.println(Arrays.toString(ar));
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum+=Integer.parseInt(ar[i]);
		}
		return sum;
	}
}

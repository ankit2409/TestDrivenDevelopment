package com.TDD.calculator;

import java.util.Arrays;

public class Calculator {
	public void validate(int num)throws NegetiveNumberException{  
	     if(num<0)  
	      throw new NegetiveNumberException("negatives not allowed");    
	   }  
	public int add(String s) {
		String ar[]=null;
		//System.out.println(s.charAt(4));
		if (s.charAt(0)=='/' && s.charAt(1)=='/' &&s.charAt(3)=='\n') {
			String n = s.substring(4);
			ar = n.split(Character.toString(s.charAt(2)));
		}else {
			ar = s.split("[\\n,]+");}
		//System.out.println(Arrays.toString(ar));
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			int num=Integer.parseInt(ar[i]);
			if(num>1000)
				continue;
			try {
				validate(num);
				sum+=num;
			}catch(Exception m){
				System.out.println(num+" "+m);
			}
		}
		return sum;
	}
}
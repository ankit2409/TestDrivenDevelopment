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
		if (s.charAt(0)=='/' && s.charAt(1)=='/') {
			int finddel=2;
			StringBuffer delimiter=new StringBuffer();
			while(finddel<s.length() && s.charAt(finddel)!='\n') {
				delimiter.append(s.charAt(finddel));
				finddel++;
			}
			String news=s.substring(finddel+1);
			ar = news.split(delimiter.toString(),0);
		}else {
			ar = s.split("[\\n,]+");}
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
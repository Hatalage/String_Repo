package com.demoprograms;

import java.util.Scanner;

public class FindNoOfChar {
public static void main(String[] args) {
	String s1="india is my country";
	int len=s1.length();
	char ch1,ch2;
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter char for it's frequancy");
	ch1=sc.next().charAt(0);
	
	for(int i=0;i<len;i++)
	{
		ch2=s1.charAt(i);
		
		if(ch1==ch2)
		{
			count++;
		}
	}
	System.out.println(ch1+" = "+count);
}
}

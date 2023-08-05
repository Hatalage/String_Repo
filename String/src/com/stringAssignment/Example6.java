package com.stringAssignment;

import java.util.Scanner;

//Write a Java program to convert lowercase string to uppercase
public class Example6 {
public static void stringLowertoUpper(String s)
{
	s=s.toUpperCase();
	int len=s.length();
	for(int i=0;i<len;i++)
	{
		System.out.print(s.charAt(i));
	}
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println();
	String a=sc.next();
	stringLowertoUpper(a);
}
}

package com.stringAssignment;
//Write a Java program to compare two strings.

public class Example6 {
public static void main(String[] args) {
	String s1="a";
	String s2="A";
	int s=s1.compareTo(s2);
	System.out.println("a= "+s);
	if(s==0)
	{
		System.out.println("Both Strings are equal");
	}
	else
	{
		System.out.println("Both String are not equal");
	}
}
}

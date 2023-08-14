package com.classAssignment;

import java.util.Scanner;

public class StringPalindrome {
public static void stringPalindromePrint(String s)
{
	int len=s.length();
	String rev=" ";
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	if(s.equals(rev))
	{
		System.out.println(s+" is palindrome");
	}
	else
	{
		System.out.println(s+" is not palindrome");
	}
	
}
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter string: ");
 String d= sc.next();
 stringPalindromePrint(d);
}
}

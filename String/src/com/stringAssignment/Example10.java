package com.stringAssignment;

import java.util.Scanner;

//Write a Java program to find  occurrence of a character in a given string.
public class Example10 {
	public static void main(String[] args) {
		String s1 = "india is my country";
		
		int count=0;
		int len=s1.length();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char for it's frequency");
		char ch1 = sc.next().charAt(0);
		
		for(int i = 0; i < len; i++)
		{
			char ch2 = s1.charAt(i);
			if(ch1 ==ch2)
			{
				count++;
			}
		}
		System.out.println(ch1 + " = " + count);
		
}
}

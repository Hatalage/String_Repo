package com.stringAssignment;
//Write a Java program to count occurrences of a character in given string.
public class Example11 {
	public static void countfreqn(String str)
	{
		int len = str.length();
		for(int j = 0; j < len ; j++)
		{
		char ch1 = str.charAt(j);
		int count=0;
		for(int i = 0; i < len; i++)
		{
		
			char ch2 = str.charAt(i);
			if(ch1 ==ch2)
			{
				count++;
			}
		}
		System.out.println(ch1 + " = " + count);
		}
}
	public static void main(String[] args) {
		String s = "hello";
		countfreqn(s);
	}
}

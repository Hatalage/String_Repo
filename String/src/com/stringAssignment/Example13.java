package com.stringAssignment;
//Write a Java program to count total number of words in a string.
public class Example13 {
	public static void main(String[] args) {
		String s="I love my india";
		s=s.trim();
		int count=1;
		int len=s.length();
		for(int i=0;i<len-1;i++)
		{
		  char ch1=s.charAt(i);
		  char ch2=s.charAt(i+1);
			if(ch1 == ' ' && ch2 != ' ')
			{
				count++;
			}
		}
		System.out.println("No of Words is: "+count);
	}
}

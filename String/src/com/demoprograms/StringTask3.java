package com.demoprograms;

public class StringTask3 {
public static void testAllVowelsFromString(String s)
{
	int len=s.length();
	char ch;
	for(int i=0;i<len;i++)
	{
		ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" is a vowel");
			
		}
		else
		{
			System.out.println(ch+" is a consonant");
		}
	}
}
public static void printAllVowels(String s) {
	int len=s.length();
	char ch;
	for(int i=0;i<len;i++)
	{
		ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch);
			
		}
		
	}
}
public static void main(String[] args) {
	String s1="welcome";
	testAllVowelsFromString(s1);
	System.out.println("----------------");
	printAllVowels(s1);
}
}

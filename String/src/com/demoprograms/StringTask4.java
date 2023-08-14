package com.demoprograms;

public class StringTask4 {
public static void  printIndexNoForAllChar(String s)
{
	int len=s.length();
	for(int i=0;i<len;i++)
	{
		char ch=s.charAt(i);
		System.out.println(ch+" = "+s.indexOf(ch,i));
	}
}
public static void main(String[] args) {
	String s1="hello";
	printIndexNoForAllChar(s1);
}
}

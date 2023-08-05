package com.demoprograms;

public class StringTask4 {
public static void  printIndexNoForAllChar(String s)
{
	int len=s.length();
	char ch;
	for(int i=0;i<len;i++)
	{
		ch=s.charAt(i);
		System.out.println(ch+" = "+s.indexOf(ch,i));
	}
}
public static void main(String[] args) {
	String s1="hello";
	printIndexNoForAllChar(s1);
}
}

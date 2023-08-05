package com.demoprograms;

public class StringTask2 {
public static void main(String[] args) {
	String s1="hello";
	int len=s1.length();
	char ch;
	for(int i=0;i<len;i++)
	{
		ch=s1.charAt(i);
		System.out.println(ch+" = "+(int)ch);
	}
}
}

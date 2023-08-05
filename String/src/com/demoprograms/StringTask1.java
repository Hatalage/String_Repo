package com.demoprograms;

public class StringTask1 {
public static void main(String[] args) {
	String s1="i love my india";
	s1=s1.toUpperCase();
	int len=s1.length();
	for(int i=0;i<len;i++)
	{
		System.out.print(s1.charAt(i));
	}
}

}

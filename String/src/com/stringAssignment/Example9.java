package com.stringAssignment;
//WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class Example9 {
public static void main(String[] args) {
	String s="HELLO$WORLD$HI";
	String str[]=s.split("\\$",3);
	for(String a:str)
	{
		System.out.println(a);
	}
}
}

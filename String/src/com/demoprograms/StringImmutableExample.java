package com.demoprograms;

public class StringImmutableExample {
public static void main(String[] args) {
	String s1="india";
	String s2="india";
	String s3="india";
	
	System.out.println("s1="+s1);
	System.out.println("s2="+s2);
	System.out.println("s3="+s3);
	
	s1="USA";
	System.out.println("------------------");
	System.out.println("s1="+s1);
	System.out.println("s2="+s2);
	System.out.println("s3="+s3);
}
}

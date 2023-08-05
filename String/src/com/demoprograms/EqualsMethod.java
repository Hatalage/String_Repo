package com.demoprograms;

public class EqualsMethod {
public static void main(String[] args) {
	String s1="shiv";
	String s2=new String("shiv");
	String s3=new String("shiv");
	System.out.println(s1==s2);
	System.out.println(s2==s3);
	boolean ans = s1.equals(s2);
	System.out.println(ans);
	System.out.println(s2.equals(s3));
	
}
}

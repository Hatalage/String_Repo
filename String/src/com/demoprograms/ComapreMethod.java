package com.demoprograms;

public class ComapreMethod {
public static void main(String[] args) {
	String s1="a";
	String s2="A";
	int a=s1.compareTo(s2);
	System.out.println("a= "+a);
	if(a==0)
	{
		System.out.println("both Strings are equal");
	}
	else
	{
		System.out.println("both Strings are not equal");
	}
	String s3="hi";
	String s4="hello";
	String s5="HELLO";
	
	int b=s3.compareToIgnoreCase(s4);
	System.out.println("b= "+b);

}
}

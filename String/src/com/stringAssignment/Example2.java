package com.stringAssignment;
//Compare string using == when “” is present see same reference is there
public class Example2 {
public static void main(String[] args) {


	String s1="hello";
	String s2=s1;
	if(s1==s2)
	{
		System.out.println("Same refference");
	}
	else
	{
		System.out.println("not a same refference");
	}
}
}

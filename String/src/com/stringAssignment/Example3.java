package com.stringAssignment;
//Compare string using new operator 
//when new is present see different reference is there
public class Example3 {
public static void main(String[] args) {
	String s1="hello";
	String s2=new String(s1);
	if(s1==s2)
	{
		System.out.println("same refference");
	}
	else
	{
		System.out.println("not same refference");
	}
}
}

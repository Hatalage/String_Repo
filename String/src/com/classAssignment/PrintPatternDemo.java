package com.classAssignment;

public class PrintPatternDemo {
public static void printPattern(String s)
{
	int len=s.length();
	s=s.toUpperCase();
	int index1=s.indexOf(' ');
	int index2=s.lastIndexOf(' ');
	System.out.println(s.charAt(0)+"."+s.charAt(index1+1)+"."+s.charAt(index2+1)+".");
	System.out.println(s.charAt(0)+"."+s.charAt(index1+1)+"."+s.substring(index2+1,len));
	System.out.println(s.substring(index2+1,len)+" "+s.substring(0,index2));
}
public static void main(String[] args) {
	String str1="sachin ramesh tendulkar";
	printPattern(str1);
}
}

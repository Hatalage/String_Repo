package com.stringAssignment;
//Write a Java program to find length of a string.
import java.util.Scanner;

public class Example4 {
public static void findLength(String s) {
	int len=s.length();
	System.out.println("Length of String is: "+len);
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String a=sc.next();
	findLength(a);
}
}

package com.stringAssignment;
//Write a Java program to find first occurrence of a word in a given string.

import java.util.Scanner;

public class Example14 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string: ");
	String str=sc.nextLine();
	System.out.println("Enter the word to find: ");
	String word=sc.nextLine();
	int index=str.indexOf(word);
	if(index==-1)
	{
		System.out.println("the first occurence is not found of "+word);
	}
	else
	{
		System.out.println("the first occurence is found of "+word+" is at the index: "+index);
		
	}
}
}
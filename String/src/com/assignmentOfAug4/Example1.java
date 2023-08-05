package com.assignmentOfAug4;

public class Example1 {
public static void main(String[] args) {
	String s1="I love my India";
	char ch1=' ',ch2;
	int flag=0;
	for(int i=0;i<s1.length();i++)
	{
		ch2=s1.charAt(i);
		if(ch2==ch1)
		{
			flag++;
		}
	}
	System.out.println(flag);
}
}

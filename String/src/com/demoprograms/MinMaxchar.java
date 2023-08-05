package com.demoprograms;

public class MinMaxchar {
public static int findMaxchar(char ch[])
{
	char max=ch[0];
	int len=ch.length;
	for(int i=1;i<len;i++)
	{
		if(ch[i]>max)
		{
			max=ch[i];
		}
		
	}
	max=(char)max;
	return max;
}
public static int findMinchar(char ch[])
{
	char min=ch[0];
	int len=ch.length;
	for(int i=1;i<len;i++)
	{
		if(ch[i]<min)
		{
			min=ch[i];
		}
	}
	min=(char)min;
	return min;
}
public static void main(String[] args) {
	char ch[]= {'A','B','D','x','v','n'};
	char s=(char)findMinchar(ch);
	char d=(char)findMaxchar(ch);
	System.out.println("maximum character is: "+d);
	System.out.println("minimum character is: "+s);
}
}

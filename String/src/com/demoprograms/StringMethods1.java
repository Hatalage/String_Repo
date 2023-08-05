package com.demoprograms;

public class StringMethods1 {
public static void main(String[] args) {
	String s1="i love india";
	
	//case 1
	int index1=s1.indexOf('i');
	
	//index1=s1.indexOf(97);
	index1=s1.indexOf('j'); //if any char is not present return -1
	System.out.println("index of char is: "+index1); //giving index for 1st occurrence
	
	//case 2
	//int index2=s1.indexOf('i',5)
	int index2=s1.indexOf(105,5);  //indexOf('i',5)
	System.out.println("i"+index2);
	
	int index3=s1.lastIndexOf('i');
	System.out.println("i="+index3);
	
	int index4=s1.lastIndexOf('i',9);
	System.out.println("i="+index4);
}
}

package com.demoprograms;

public class ConcatMethodDemo {
public static void main(String[] args) {
	String s1="Welcome"; //scp welcome
	s1.concat(" to TQ");  //heap - welcome to TQ -unreference | scp to TQ
	System.out.println(s1); 
	s1=s1.concat(" to Pune"); //heap - welcome to pune (ref ny s1) | scp to pune
	System.out.println(s1);  //welcome to pune
}
}

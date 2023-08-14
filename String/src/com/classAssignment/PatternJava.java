package com.classAssignment;

public class PatternJava {
	public static void javapatterns(String s)
	{
		System.out.println("-------by using charAt-------------");
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(0) + " " + s.charAt(1));
		System.out.println(s.charAt(0) + " " + s.charAt(1) + " "+ s.charAt(2));
		System.out.println(s.charAt(0) + " " + s.charAt(1) +" " +  s.charAt(2) + " " + s.charAt(3));
		
		System.out.println("------By using substring----------");
		for(int i = 0; i <= s.length(); i++)
		{
			String s2 = s.substring(0, i);
			System.out.println(s2 );
		}
	
	}
	public static void main(String[] args) {
		String s1 = "JAVA";
		
		javapatterns(s1);
}
}

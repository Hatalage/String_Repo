package com.demoprograms;

public class MutableStringDemo {
public static void main(String[] args) {
	StringBuffer sb1=new StringBuffer();
	System.out.println("Capacity: "+sb1.capacity()); //16
	sb1.append("hello");
	System.out.println("sb1 :"+sb1);
	System.out.println("Capacity :"+sb1.capacity());  //16
	sb1.append("welcome hello");
	System.out.println("Capacity :"+sb1.capacity());  //34
	//new cap=(oldcap*2)+2;
	//new cap=(16*2)+2;
	
	System.out.println(sb1);
	
	//sb1.reverse();
	//System.out.println(sb1);
	
	sb1.delete(2, 5);
	System.out.println(sb1);  //hewelcome hello
	
	sb1.insert(2,  "ti");
	System.out.println(sb1);   //hetiwelcome hello
	
	sb1.replace(1, 6, "str");
	System.out.println(sb1);   //hstrlcome hello


}
}

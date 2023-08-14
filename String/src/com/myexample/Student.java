package com.myexample;

import java.util.Objects;

import com.demoprograms.Laptop;

public class Student {
private int id;
private String name;
private int age;
public Student(int id,String name,int age)
{
	this.id=id;
	this.name=name;
	this.age=age;
}
public void setId(int id)
{
	this.id=id;
}
public void setName(String name)
{
	this.name=name;
}
public void setAge(int age)
{
	this.age=age;
}
public int getId()
{
	return id;
}
public String getName()
{
	return name;
}
public int getAge()
{
	return age;
}
public String toString()
{
	return id+" "+name+" "+age;
}
public boolean equals(Object obj)
{
	Student s1=(Student)obj;
	return this.id==s1.id && this.name.equals(s1.name) && this.age==s1.age; 
}
public static void main(String[] args) {
	Student s1=new Student(1,"raj",15);
	Student s2=new Student(2,"sam",20);
	Student s3=new Student(1,"raj",15);
	
	System.out.println(s1==s2);
	System.out.println(s1.equals(s3));
	System.out.println(s1==s3);
}
}


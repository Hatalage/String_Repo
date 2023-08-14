package com.demoprograms;

import java.util.Objects;

public class Laptop {
private String modelName;
private double modelPrice;
public Laptop(String modelName, double modelPrice) {
	super();
	this.modelName = modelName;
	this.modelPrice = modelPrice;
}
public String getModelName() {
	return modelName;
}
public void setModelName(String modelName) {
	this.modelName = modelName;
}
public double getModelPrice() {
	return modelPrice;
}
public void setModelPrice(double modelPrice) {
	this.modelPrice = modelPrice;
}

@Override
public String toString() {
	return "Laptop [modelName=" + modelName + ", modelPrice=" + modelPrice + "]";
}
@Override
public boolean equals(Object obj) {
	Laptop other = (Laptop) obj;
	return Objects.equals(modelName, other.modelName)
			&& Double.doubleToLongBits(modelPrice) == Double.doubleToLongBits(other.modelPrice);
}
public static void main(String[] args) {
	Laptop l1=new Laptop("Dell",50000);
	Laptop l2=new Laptop("Lenovo",45000);
	Laptop l3=new Laptop("Dell",50000);
	
	
	System.out.println(l1==l2); //false
	System.out.println(l1==l3);  //false
	System.out.println(l1.equals(l3));
	
}
}

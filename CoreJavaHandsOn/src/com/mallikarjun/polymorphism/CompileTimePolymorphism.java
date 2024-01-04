package com.mallikarjun.polymorphism;

public class CompileTimePolymorphism {

	public void display() {
		System.out.println("Inside Method 1");
	}

	public void display(int age) {
		System.out.println("Inside Method 2" + " " + "age Is" + " " + age);
	}

	public String display(String name) {

		System.out.println("Inside Meyhod 3" + " " + "name is" + " " + name);
		return name;

	}

	public void display(String productName, double price) {
		System.out.println("Inside Method 4");
		System.out.println("ProductName" + " " + " " + productName + "And Price" + " " + price);
	}

	public static void main(String[] args) {
		CompileTimePolymorphism c = new CompileTimePolymorphism();
		c.display();
		c.display(20);
		c.display("Ravi");
		c.display("Tv", 20000);
	}

}

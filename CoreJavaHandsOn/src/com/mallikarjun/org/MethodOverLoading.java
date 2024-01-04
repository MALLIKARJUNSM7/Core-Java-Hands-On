package com.mallikarjun.org;

public class MethodOverLoading {

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
		MethodOverLoading ml = new MethodOverLoading();
		ml.display();
		ml.display(20);
		ml.display("Ravi");
		ml.display("Tv", 20000);
	}

}

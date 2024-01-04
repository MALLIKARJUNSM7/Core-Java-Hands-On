package com.mallikarjun.org;

public class Blocks {
	/* Static and non static blocks */
	String name;

	int age;

	{
		name = "Ramkumar";
	}

	{
		age = 20;
	}
	static {
		System.out.println("In a static block 1");
	}

	static {
		System.out.println("In a static block 2");
	}

	public static void main(String[] args) {
		System.out.println("In main method");
		Blocks b = new Blocks();
		System.out.println(b.name + " " + b.age);

	}

	static {
		System.out.println("In a static block 3");
	}

}

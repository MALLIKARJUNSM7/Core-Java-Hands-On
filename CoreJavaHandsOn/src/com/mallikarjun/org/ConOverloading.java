package com.mallikarjun.org;

public class ConOverloading {

	ConOverloading() {
		System.out.println("Constructor 1");
	}

	ConOverloading(int id) {
		System.out.println("constructor 2" + " " + "Id is" + "" + " " + id);
	}

	ConOverloading(String name, int age) {
		System.out.println("constructor 3" + " " + "name:" + name + " " + "age" + " " + age);
	}

	public static void main(String[] args) {
		ConOverloading c1 = new ConOverloading();
		ConOverloading c2 = new ConOverloading(10);
		ConOverloading c3 = new ConOverloading("Raj", 24);
	}

}

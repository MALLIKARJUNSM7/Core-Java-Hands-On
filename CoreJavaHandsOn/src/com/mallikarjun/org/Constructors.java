package com.mallikarjun.org;

public class Constructors {

	String subject;
	double price;

	/*
	 * Constructors() { System.out.println("Non parameterised constructor"); }
	 */

	public Constructors(String subject, double price) {
		System.out.println("Parameterised constructor");
		this.subject = subject;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Constructors [subject=" + subject + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		Constructors c = new Constructors("English", 25000);
		Constructors c1 = new Constructors("Java", 35000);
		System.out.println(c + " " + c1);

	}

}

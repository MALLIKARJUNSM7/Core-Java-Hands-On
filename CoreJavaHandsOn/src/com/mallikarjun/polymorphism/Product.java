package com.mallikarjun.polymorphism;

public class Product extends RunTimePolymorphism {

	@Override
	public void display() {
		System.out.println("RunTime Ploymorphism");
	}

	public void disp() {
		System.out.println("Product list submitted");
	}

	public static void main(String[] args) {
		RunTimePolymorphism rt = new Product();
		rt.display();

	}

}

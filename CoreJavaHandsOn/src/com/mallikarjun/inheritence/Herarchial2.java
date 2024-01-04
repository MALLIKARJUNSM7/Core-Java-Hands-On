package com.mallikarjun.inheritence;

public class Herarchial2 extends HerarchialIn {

	public void display() {
		System.out.println("In Herarchial Inheritence");
	}

	public static void main(String[] args) {

		Herarchial2 h = new Herarchial2();

		h.bike();
		h.display();

	}
}

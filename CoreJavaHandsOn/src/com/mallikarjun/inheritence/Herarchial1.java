package com.mallikarjun.inheritence;

public class Herarchial1 extends HerarchialIn {

	public void car() {
		System.out.println("Car started");
	}

	public static void main(String[] args) {
		Herarchial1 h = new Herarchial1();
		h.bike();
		h.car();
	}

}

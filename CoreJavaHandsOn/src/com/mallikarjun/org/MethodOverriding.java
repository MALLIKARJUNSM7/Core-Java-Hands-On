package com.mallikarjun.org;

public class MethodOverriding extends MethodOvl1 {

	@Override
	public void display() {
		System.out.println("Hi Good Morning");
	}

	@Override
	public void main() {
		System.out.println("Good Evening");

	}

	public static void main(String[] args) {

		MethodOverriding ml = new MethodOverriding();
		ml.display();
		ml.main();

	}

}

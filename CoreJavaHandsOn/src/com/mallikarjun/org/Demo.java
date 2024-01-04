package com.mallikarjun.org;

public class Demo {
	// Conditional Statements
	public static void main(String[] args) {

		int age = 21;
		int a = 5;
		int b = 5;
		/// 1.if else
		if (age >= 21) {
			System.out.println("You can Apply for a voter Id card");

		}

		else {
			System.out.println("You are not eligible to apply for voter ID card");
		}

		System.out.println("-------------2.If else if-----------------");

		if (a > b) {
			System.out.println(a + "Is greater than " + b);
		}

		else if (a < b) {
			System.out.println(a + "Is lesser than" + b);

		}

		else {
			System.out.println(a + " " + "Is equal to" + " " + b);
		}

		System.out.println("Nested if");
		if (a <= 10) {
			System.out.println("Inside outer if");

			if (a == 5) {
				System.out.println("a is equal to 5");
			}

			else {
				System.out.println("a is not equal to 5");
			}

		}

		else {
			System.out.println("a is greater than 10");
		}

	}

}

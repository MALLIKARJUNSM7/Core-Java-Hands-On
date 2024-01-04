package com.mallikarjun.org;

public class SwitchStatements {

	public static void main(String[] args) {

		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;

		case 'B':
			System.out.println("Very Good");
			break;

		case 'C':
			System.out.println("Good");
			break;

		default:
			System.out.println("Invalid Grade");
		}

	}

}

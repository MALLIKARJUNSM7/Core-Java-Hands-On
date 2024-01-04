package com.mallikarjun.org;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Mall Of Asia");
		System.out.println("Enter Your Name");
		String name = scan.next();
		System.out.println("Enter Your Age");
		int age = scan.nextInt();
		System.out.println("Enter your password");
		int password = scan.nextInt();
		if (password == 1234) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Invalid password");
		}
	}

}

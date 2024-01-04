package com.mallikarjun.org;

public class LoopingStatements {

	public static void main(String[] args) {
		System.out.println("//For Loop");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		System.out.println("-----------------------");
		for (int j = 5; j >= 1; j--) {
			System.out.println(j);
		}

		System.out.println("While loop");
		int n = 1;
		while (n <= 5) {
			System.out.println(n);
			n++;
		}

		System.out.println("do while loop");

		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j <= 5);
	}

}

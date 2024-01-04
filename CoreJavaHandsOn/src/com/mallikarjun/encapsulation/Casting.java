package com.mallikarjun.encapsulation;

public class Casting {

	public static void main(String[] args) {

		/*
		 * Widening: byte-short-int-long-float-double
		 */
		byte a = 5;
		int b = a;
		System.out.println(b);

		/*
		 * Narrowing: double-float-long-int-short-byte
		 */

		double price = 20.00;
		int p1 = (int) price;
		System.out.println(p1);

	}

}

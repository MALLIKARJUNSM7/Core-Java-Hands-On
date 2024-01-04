package com.mallikarjun.abstraction;

public class ATM implements Bank {

	int balance = 10000;

	@Override
	public void deposit(int amount) {
		System.out.println("Depositing R.S" + " " + amount);
		balance = balance + amount;
		System.out.println("Amount Deposited Successfully");

	}

	@Override
	public void withdrawn(int amount) {

		System.out.println("Withdrwaing R.S" + " " + amount);
		balance = balance - amount;
		System.out.println("Amount Withdrwan Successfully");
	}

	@Override
	public void checkBalance() {
		System.out.println("Available Balance R.S" + " " + balance);

	}

	public static void main(String[] args) {

		Bank b = new ATM();
		b.deposit(40000);
		b.withdrawn(20000);
		b.checkBalance();
	}

}

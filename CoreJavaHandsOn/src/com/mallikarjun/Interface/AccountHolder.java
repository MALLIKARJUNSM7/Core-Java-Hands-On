package com.mallikarjun.Interface;

public class AccountHolder implements HDFCBank {

	@Override
	public void withdrawn() {

		System.out.println("Amount withdrawn");
	}

	@Override
	public void deposit() {

		System.out.println("Amount Deposited");
	}

	public static void main(String[] args) {

		AccountHolder a = new AccountHolder();
		a.deposit();
		a.withdrawn();

	}

}

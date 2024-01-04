package com.mallikarjun.org;

public class Methods {

	public void demo() {
		System.out.println("method without argument and without return type");
	}

	public int main() {
		System.out.println("method without argument and with return statement");
		return 10;
	}

	public void disp(int age) {
		System.out.println("method with argument and without return statement age is" + " " + age);

	}

	public String displayName(String name) {
		System.out.println("method with argument and with return statement");
		return name;

	}

	public static void main(String[] args) {
		Methods m = new Methods();
		m.demo();
		System.out.println(m.main());
		m.disp(10);
		System.out.println(m.displayName("ARJUN"));
	}

}

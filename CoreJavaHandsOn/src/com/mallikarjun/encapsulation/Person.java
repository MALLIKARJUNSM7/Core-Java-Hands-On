package com.mallikarjun.encapsulation;

public class Person {

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		Person p = new Person();
		p.setAge(23);
		p.setName("Ramkumar");
		System.out.println("Age:" + " " + p.getAge() + " " + "Name:" + " " + p.getName());

	}

}

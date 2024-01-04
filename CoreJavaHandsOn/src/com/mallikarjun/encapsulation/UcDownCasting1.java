package com.mallikarjun.encapsulation;

public class UcDownCasting1 extends UcDowncasting {

	public void display() {
		System.out.println("DownCasting");
	}

	public static void main(String[] args) {

		UcDowncasting u = new UcDownCasting1();
		u.main();

		UcDownCasting1 dc = (UcDownCasting1) u;

		dc.display();

	}

}

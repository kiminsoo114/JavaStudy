package com.sist.main;

class Car5 {
	String color;
	String gearType;
	int door;

	Car5() {
	}

	Car5(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car5 c1 = new Car5();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;

		Car5 c2 = new Car5("white", "auto", 4);
		System.out.println("c1ÀÇ color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2ÀÇ color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
	}
}

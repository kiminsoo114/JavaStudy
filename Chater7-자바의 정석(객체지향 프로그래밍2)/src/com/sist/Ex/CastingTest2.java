package com.sist.Ex;

public class CastingTest2 {
	public static void main(String[] args) {
		Truck tru = new Truck();
		Truck tru2 = null;
		FireEngine fe = null;

		tru.drive();
		fe = (FireEngine) tru;
		fe.drive();
		tru2 = fe;
		tru2.drive();
	}
}

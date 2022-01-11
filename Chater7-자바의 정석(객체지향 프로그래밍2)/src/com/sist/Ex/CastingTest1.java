package com.sist.Ex;

public class CastingTest1 {
	public static void main(String[] args) {
		Truck tru = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		tru = fe; // tru = (tru)fe;에서 형변환이 생략된 형태
		fe2 = (FireEngine) tru;// 자손타입<-조상타입
		tru.stop();
		fe2.water();
		tru.drive();
		fe2.stop();
		fe.stop();
		

	}
}

class Truck {
	String color;
	int door;

	void drive() {// 운전하는 기능
		System.out.println("drive,Brrrr~");
	}

	void stop() {// 멈추는 기능
		System.out.println("stop!!");
	}
}

class FireEngine extends Truck {// 소방차
	void water() {// 물을 뿌리는 기능
		System.out.println("water!!");
	}
}
package com.sist.Ex;

public class CastingTest1 {
	public static void main(String[] args) {
		Truck tru = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		tru = fe; // tru = (tru)fe;���� ����ȯ�� ������ ����
		fe2 = (FireEngine) tru;// �ڼ�Ÿ��<-����Ÿ��
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

	void drive() {// �����ϴ� ���
		System.out.println("drive,Brrrr~");
	}

	void stop() {// ���ߴ� ���
		System.out.println("stop!!");
	}
}

class FireEngine extends Truck {// �ҹ���
	void water() {// ���� �Ѹ��� ���
		System.out.println("water!!");
	}
}
package com.sist.Ex;

public class InstanceofTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		if(fe instanceof Truck) {
			System.out.println("This is a Car instance.");
		}
		if(fe instanceof Object) {
			System.out.println("This is and Object instance");
		}
		System.out.println(fe.getClass().getName());//Ŭ������ �̸��� ���
	}
}

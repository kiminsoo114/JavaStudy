package com.sist.main;

public class CallStackTest {
	public static void main(String[] args) {
		firstMethod();	//static������ ��ü �������� ȣ���� �����ϴ�.
	}
	static void firstMethod() {
		secondMethod();
		System.out.println("firstMethod()");
	}
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}

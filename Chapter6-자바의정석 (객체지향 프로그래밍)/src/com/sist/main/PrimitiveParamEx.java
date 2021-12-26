package com.sist.main;

class Data{int x;}

public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main():x="+d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main():x="+d.x);
	}
	static void change(int x) {//기본형 매개변수
		x=1000;
		System.out.println("change()x:"+x); //매개변수의 값만 변경된것 메소드가 종료되면 매개변수 x는 스택에서 사라짐
		
	}
}

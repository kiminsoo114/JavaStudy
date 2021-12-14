package com.sist.main;
//사용자 정의 예외처리 (자바에서 지원하지 않는 예외가 발생시에 직접 만들어서 처리하는 것)
//439 page (사용빈도는 거의 없다)
//try-catch를 쓰는 방법과 throws 쓰는 방법 두가지만 확실히 알면 된다.
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);//Exception클래스의 생성자
	}//this => MyException클래스의 객체 => static변수로 되어있음
}

/*
 * 		class A
 * 		{
 * 		}
 * 		=>1. 클래스 저장
 * 			===========
 * 			A a = new A(); //리플렉션 Class.forName()
 * 			=> JVM =>this =a; => 객체저장 주소를 기억하고 있다
 *			
 *		  2. 상속(속도가 저하 => JOIN (Subquery) ==> 최적화
 *			메모리 할당 ==> 상속 내리는 클래스 메모리 할당
 *						  상속 받는 클래스 메모리 할당 		
*/
public class MainClass5 {
	public static void main(String[] args) {
		
	}
}

package sist.com.basic.obj;

public class ObjextEx1 {
	int instanceValue;//객체 변수, new를 할때 생성. 
	//heap영역이다.
	static int staticValue;//클래스 변수,클래스 영역=static
	final int DATA=100;//종단 변수,선언을 해주어야한다.
	
	//위의 세개의 변수는 모두 멤버 변수이다.
	
	public void method() {
		int local;//지역 변수 stack이라는 메모리에 존재
		
	}//메소드 영역


}//클래스 영역

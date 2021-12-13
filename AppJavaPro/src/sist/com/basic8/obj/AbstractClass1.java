package sist.com.basic8.obj;
//interface란 완전추상 구현이란 있을수없다.
public interface AbstractClass1 {
//	public void interMethod() {
//		
//	}  인터페이스는 완전 추상클래스이게 일반메소드가 들어올 수가 없다.
	//int data; new를 사용불가. 인스턴스변수 불가능.
	static final int DATA=100;//final이 늘 생략되어있다.
	//final이라 변수명을 대문자로 쓴다.
	//final을 써도 그만 안써도 그만. 그앞에는 static이 생략되어있다.
	//내장되어있는건 final이기에 값을 무조건 선언해주어야한다.
	//명시적으로만 선언이 가능하다.
	//final은 외부에서 접근하게 만드는것이므로 절대 private는 사용불가.
	
	public abstract void interMethod1();
	public void interMethod11();
	
	
	//이렇게 쓰면 되는데 interface는 무조건 추상이기에 abstract를 써도 그만 안써도 상관없다.
	//당연히 new도 사용불가능하기에 인스턴스변수도 불가능.
}

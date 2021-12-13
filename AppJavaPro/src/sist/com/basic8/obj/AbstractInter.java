package sist.com.basic8.obj;

public abstract class AbstractInter implements AbstractClass1{
	public void interMethod1() {
		System.out.println("interMethod1");
	}//인터페이스의 메소드를 다가지고 올 필요는 없다. 그러기위해서는
	//abstract를 클래스앞에 붙여줘서 미완성으로 만들어준다.
	//abstract는 완성된것도 있고 미완성 된것도 있다.
	//그러므로 abstract 상태에서 interMethod11을 가져오면 에러난다.
//	public abstract void interMethod11() {
//		
//	} 생략되어 있다.



}

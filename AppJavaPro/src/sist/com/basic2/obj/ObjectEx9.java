package sist.com.basic2.obj;

public class ObjectEx9 {//extends Object생략되어있다. Object에서 ObjectEx9로 확장된거다.

	public ObjectEx9() {
		 
	}//생성자
	public Object getData() {
		return new ObjectEx1();//Object라고 쓰면 integer도 double도 String도 모두 사용된다. 이것을 자바의 다형성이라고 부른다.
		
		}
	
}

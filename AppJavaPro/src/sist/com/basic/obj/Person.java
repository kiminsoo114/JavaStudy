package sist.com.basic.obj;

public class Person {
	//Member,Instance
	private String name;//멤버변수,field,state(상태),attribute(속성),data라고 부른다.
	private int age;
	private double height;
	//멤버 변수이다.
	
	//overloading(과적) - 메소드의 이름은 set으로 같아야하고 타입은 달라야함.
	public void set(String name) {
		this.name=name;//this를 써줘야지 멤버변수의 이름과 지역변수의 이름을 비교할 수있다. this.name이 멤버변수이다.
	}
	public void set(String name, int age) {
		set(name);
		this.age=age;
		
	}
	public void set(String name, int age, double height) {
		set(name, age);
		this.height=height;
		
	}
	public void disp() {
		System.out.println("name="+this.name+" age="+this.age+" height="+this.height);
		
	}
	
	public static void main(String[] args) {
		Person p1=new Person();//name|age|height
		Person p2=new Person();//name|age|height
		//p는 스택에 만들어지고 new는 Heap에 만들어지며
		//heap의 주소는 스택에서 찾아간다.
		p1.set("민섭",25,180.5);//this가 p1을 가르키면서 set()안의 내용이 p1으로 들어간다.
		p1.disp();//this가 p1을 가르키는것
		p2.set("인수",28);
		p2.disp();//this가 p2을 가르키는것.

		
		
	}
}

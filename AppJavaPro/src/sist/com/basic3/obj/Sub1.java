package sist.com.basic3.obj;

public class Sub1 extends Parent {
	private int sub1Value;
	
	public Sub1() {
		System.out.println("hi");
	}
	
	public Sub1(int parentValue, int sub1Value) {
		super(parentValue);
		this.sub1Value=sub1Value;
		System.out.println("Sub1������");
	}
}

package sist.com.basic.obj;

public class C {
	private int c;
	private B b;
	
	public C() {
		
	}//기본생성자
	public C(int c) {
		this.c=c;
	}
	public C(int c, B b) {
		this.c=c;
		this.b=b;
	}
	public void setB(B b) {
		this.b=b;
	}
	public B getB() {
		return this.b;
	}
	
}

package sist.com.basic.obj;

public class D {
	private int d;
	private C c;
	public D() {
		
	}
	public D(int d) {
		this.d=d;
	}
	public D(int d, C c) {
		this.d=d;
		this.c=c;
	}
	public void setC(C c) {
		this.c=c;
	}
	public C getC() {
		return this.c;
	}
}

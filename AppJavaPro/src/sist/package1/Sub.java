package sist.package1;

public class Sub extends Super {
	public Sub() {
		this.publicData=10;
		this.protectedData=20;
		this.defaultData=30;
		//같은 패키지라도 같은 클래스에서만 접근 가능한게 private이기에 접근불가
	}
}

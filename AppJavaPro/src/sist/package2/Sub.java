package sist.package2;

import sist.package1.Super;


public class Sub extends Super {
	public Sub() {
		this.publicData=10;
		this.protectedData=20;
		//this.defaultData=30; 에러난다. 디폴트는 같은 패키지 안에서만 접근가능
		//this.private=40; 당연히 에러. 같은 클래스에만 접근가능
	}
}

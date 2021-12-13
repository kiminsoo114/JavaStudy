package sist.package2;

import sist.package1.Super;

public class InstaceClass {
	public void action() {
		Super s= new Super();
		s.publicData=10;
		//s.protectedData=20; 후손처리를 안해줬기 때문에 오류.
	}
}

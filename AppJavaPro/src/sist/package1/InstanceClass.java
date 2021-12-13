package sist.package1;

public class InstanceClass {//후손영역은 아닌데 같은 패키지의 영역
	
	public void action() {
		Super s = new Super();
		s.publicData=10;
		s.protectedData=20;
		s.defaultData=30;
	}//패키지가 같으면 접근가능함.  
}

package sist.package2;

import sist.package1.Super;


public class Sub extends Super {
	public Sub() {
		this.publicData=10;
		this.protectedData=20;
		//this.defaultData=30; ��������. ����Ʈ�� ���� ��Ű�� �ȿ����� ���ٰ���
		//this.private=40; �翬�� ����. ���� Ŭ�������� ���ٰ���
	}
}

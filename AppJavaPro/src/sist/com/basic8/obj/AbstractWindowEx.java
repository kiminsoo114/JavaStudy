package sist.com.basic8.obj;

public abstract class AbstractWindowEx implements MouseInter {

	@Override
	public void mousePree() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("MouseWindowPress");
	}

	@Override
	public void mouseClick() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("MouseWindowClick");
	}
	public abstract void mouseRelease();//��������
}

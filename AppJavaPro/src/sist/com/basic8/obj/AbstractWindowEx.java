package sist.com.basic8.obj;

public abstract class AbstractWindowEx implements MouseInter {

	@Override
	public void mousePree() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("MouseWindowPress");
	}

	@Override
	public void mouseClick() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("MouseWindowClick");
	}
	public abstract void mouseRelease();//생략가능
}

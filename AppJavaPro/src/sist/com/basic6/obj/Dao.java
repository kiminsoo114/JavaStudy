package sist.com.basic6.obj;

public abstract class Dao {//�߻�Ŭ���� (abstractClass)�ϼ�+�̿ϼ�  
	public void connectProcess() {
		System.out.println("Data Access Connect!");
	}
	public abstract void select();
	public abstract void update();
	public abstract void delete();
	public abstract void info();
	
	
		
}
    
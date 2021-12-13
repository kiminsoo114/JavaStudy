package sist.com.basic6.obj;

public abstract class Dao {//추상클래스 (abstractClass)완성+미완성  
	public void connectProcess() {
		System.out.println("Data Access Connect!");
	}
	public abstract void select();
	public abstract void update();
	public abstract void delete();
	public abstract void info();
	
	
		
}
    
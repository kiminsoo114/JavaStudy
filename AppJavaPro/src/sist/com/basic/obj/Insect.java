package sist.com.basic.obj;

public class Insect {
	private String name;
	private int leg;
	private String eat;
	
	public void set(String name) {
		this.name=name;
	}
	
	public void set(String name,int leg ) {
		set(name);
		this.leg=leg;
	}
	public void set(String name, int leg, String eat) {
		set(name,leg);
		this.eat=eat;
		
	}
	public void disp() {
		System.out.println("name="+name+" leg="+leg+" eat="+eat);
	}
	public static void main(String[] args) {
		Insect i1=new Insect();
		Insect i2=new Insect();
		i1.set("개미",6,"잡식");
		i1.disp();
	}
}
	
	

package sist.com.basic.obj;

public class Person {
	//Member,Instance
	private String name;//�������,field,state(����),attribute(�Ӽ�),data��� �θ���.
	private int age;
	private double height;
	//��� �����̴�.
	
	//overloading(����) - �޼ҵ��� �̸��� set���� ���ƾ��ϰ� Ÿ���� �޶����.
	public void set(String name) {
		this.name=name;//this�� ������� ��������� �̸��� ���������� �̸��� ���� ���ִ�. this.name�� ��������̴�.
	}
	public void set(String name, int age) {
		set(name);
		this.age=age;
		
	}
	public void set(String name, int age, double height) {
		set(name, age);
		this.height=height;
		
	}
	public void disp() {
		System.out.println("name="+this.name+" age="+this.age+" height="+this.height);
		
	}
	
	public static void main(String[] args) {
		Person p1=new Person();//name|age|height
		Person p2=new Person();//name|age|height
		//p�� ���ÿ� ��������� new�� Heap�� ���������
		//heap�� �ּҴ� ���ÿ��� ã�ư���.
		p1.set("�μ�",25,180.5);//this�� p1�� ����Ű�鼭 set()���� ������ p1���� ����.
		p1.disp();//this�� p1�� ����Ű�°�
		p2.set("�μ�",28);
		p2.disp();//this�� p2�� ����Ű�°�.

		
		
	}
}

package com.sist.main;

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white", "auto", 4);//car(Stirng color, String gearTpye, int door)�� ȣ�� <-������
		System.out.println("1");
	}
	Car(String color){
		this(color, "auto", 4);
		System.out.println("2");
	}
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("3");
	}
}

public class CarTest2 {
	public static void main(String[] args) {
			Car c1 = new Car();
			Car c2 = new Car("blue");
			Car c3 = new Car("Black", "auto", 6);
			
			//System.out.println("c1�� color="+c1.color+",gearType="+c1.gearType+",door="+c1.door);
			
			//System.out.println("c2�� color="+c2.color+",gearType="+c2.gearType+",door="+c2.door);
	}
}

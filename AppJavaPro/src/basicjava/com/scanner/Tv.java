package basicjava.com.scanner;

class Tv {
	//tv�� �Ӽ�(�������)
	String color;		//����
	boolean power;		//�������� on/off	
	int channel;	//ä��

	//tv�� ���(�޼���)
	public void power() {
		power =! power;
	}
	public void channerUp() {
		++channel;
	}
	public void channelDown() {
		--channel;
	}
	public static void main(String[] args) {
		Tv t1=new Tv();
		Tv t2=new Tv();
		
		System.out.println("t1�� channel����"+t1.channel+"�Դϴ�.");
		System.out.println("t2�� channel����"+t2.channel+"�Դϴ�.");
		
		t1.channel = 7;//channel ���� 7���� �Ѵ�.
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�");
		
		System.out.println("t1�� channel����"+t1.channel+"�Դϴ�.");
		System.out.println("t2�� channel����"+t2.channel+"�Դϴ�.");
	}
}


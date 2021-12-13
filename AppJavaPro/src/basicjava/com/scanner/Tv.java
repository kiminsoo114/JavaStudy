package basicjava.com.scanner;

class Tv {
	//tv의 속성(멤버변수)
	String color;		//색상
	boolean power;		//전원상태 on/off	
	int channel;	//채널

	//tv의 기능(메서드)
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
		
		System.out.println("t1의 channel값은"+t1.channel+"입니다.");
		System.out.println("t2의 channel값은"+t2.channel+"입니다.");
		
		t1.channel = 7;//channel 값을 7으로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다");
		
		System.out.println("t1의 channel값은"+t1.channel+"입니다.");
		System.out.println("t2의 channel값은"+t2.channel+"입니다.");
	}
}


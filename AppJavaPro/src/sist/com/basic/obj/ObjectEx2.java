package sist.com.basic.obj;

public class ObjectEx2 {
	int data;//멤버변수는 초기값들이 정해졌있다. int의 경우는 0이다.
	static int staticValue; //staticValue도 초기값은 0으로 되어있다.//스태틱 변수 같은 말로는 클래스 변수라고도 한다.
	//static 변수는 하나의 클래스에서 모든 객체들이 공유하는 변수이다.
	final int GAB = 500;//종단변수
	public void method() {
		int value=0;
		value++;
		data++;
		staticValue++;
		System.out.println("value="+value+"data="+data+"staticValue="+staticValue);
		//int value;//지역변수는 stack에 올라간다.
		//value++;//int value;밑에 value++;을 하면 int value=0;처럼 초기값을 안줘서 에러가 나는것이다. 지역변수는 초기값을 설정해주어야한다.
		//지역변수는 호출하면 그때부터 시작되는거고 다시 초기화된다.
	}
											//println	
	public static void main(String[] args) {//main ->메인 위에 println올라가는거.
									   //stack메모리 구조
		ObjectEx2 o1 =new ObjectEx2();	
		ObjectEx2 o2 =new ObjectEx2();
		ObjectEx2 o3 =new ObjectEx2();
		System.out.println("HelloMain");
	//data=90; int data앞에 static을 안붙이면 data는 안들어간다 이유는 new data를 해줘서 공간을 안맞들어 줬기 때문이다.
	new ObjectEx2().data=90;//data(90)을 넣었다.
	System.out.println(new ObjectEx2().data);//결과값은 0이 나오는데 new를 쓰는것은 매번 HEAP에다가 새로운 담을 공간을 만드는 것임으로 println에 있는 new ObjectEx2().는 println의 new ObjectEx2()의 공간과 다른 곳이다.
	o1.method(); //value=1 data=1
	o1.method(); //value=1 data=1
	o1.method();
	o2.method();
	o2.method();
	o3.method();
	o1.data=500;
	ObjectEx2.staticValue=50;
	//o1.GAB=99;//오류나는 이유는 final로 더이상 바꾸지않는다 했기 때문이다.
	}
}

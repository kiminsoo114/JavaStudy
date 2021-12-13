package sist.com.basic.obj;

public class Font {
	String fontFace;
	int size;
	String color;
	static String nation;//static영역에 nation은 들어가있는 것으로 new할때마다 nation은 생기지 않는다.
	//new 가 생길때보다 먼저 static영역에 있기 때문
	//private final int weight=20;//new font할때마다 20이라는 변하지않는 값이 계속 만들어질것.
	static final int weight = 20;//위처럼 할바에는 static영역에 넣어버린것이다.
	
//	public static void main(String[] args) {
//		new Font();//메모리 힙에 fontFace|size|color가 new font할때마다 만들어진다.
//		Font.nation="AA";
//		System.out.println(Font.weight);
	
}

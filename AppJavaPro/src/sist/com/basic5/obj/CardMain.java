package sist.com.basic5.obj;

public class CardMain {
	
	public static void main(String[] args) {
//		Card card=new Card();//객체를 생성하는 것.
		Card.getInstance().setName("연지");
		System.out.println(Card.getInstance().getName());
	}
}

package sist.com.basic5.obj;

public class CardMain {
	
	public static void main(String[] args) {
//		Card card=new Card();//��ü�� �����ϴ� ��.
		Card.getInstance().setName("����");
		System.out.println(Card.getInstance().getName());
	}
}

package sist.com.basic5.obj;

public class Card {
	private String name;//����ȭ(private)
	private static Card card;
	
	public static Card getInstance() {
		if(card==null)
			card=new Card();
		return card;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return this.name;
	}
	private Card() {//Card��ü������ ������ �����ع���.
		super();
	}
}

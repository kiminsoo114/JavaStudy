package sist.com.basic.obj;
//class는 설계도(속성(data(상태)) + 기능(function(행동)),사용자정의 자료형이라고도 부른다,설계도는 묶음(속성과 기능)이다. 
public class Book{//(book이라는 하나의 자료형)

	private String bookName;
	private String author;
	private String publisher;
	private int price;
	private String isbn; //private : 접근 제한자.
	//속성은 접근을못하지만 메소드를 통해서 접근 가능하게 할 수 있다.
	public void setPrice(int price) {
		//if(value>=6000&&value<=9500)
		//set이 붙는 메소드는 뭔가를 넣어줄때 사용한다.
		this.price =price;
		
		//Book this와 this,이 생략되어 있는것.
	}
	public int getPrice() {
		return this. price;
		//this가 생략되어 있었던 것.생략해도 됨.
	}
	public Book getInstance(Book this) {
//		return new Book();	//새로운 영역에 저장되어 영향을 안받는다.
		return this;		//
	}
	
	public static void main(String[] args) {
//	new Book().bookName="민섭의 정석";
//	System.out.println(new Book().bookName);
//	}
//	Book b = new Book();
//	b.bookName="연지처럼..";
//	System.out.println(b.bookName);
//		Book book = new Book();
//		book.author="최은영";
//		System.err.println(book.author);
	}
}//클래스 영역.

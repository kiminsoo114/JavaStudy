package sist.com.basic.obj;
//class�� ���赵(�Ӽ�(data(����)) + ���(function(�ൿ)),��������� �ڷ����̶�� �θ���,���赵�� ����(�Ӽ��� ���)�̴�. 
public class Book{//(book�̶�� �ϳ��� �ڷ���)

	private String bookName;
	private String author;
	private String publisher;
	private int price;
	private String isbn; //private : ���� ������.
	//�Ӽ��� �������������� �޼ҵ带 ���ؼ� ���� �����ϰ� �� �� �ִ�.
	public void setPrice(int price) {
		//if(value>=6000&&value<=9500)
		//set�� �ٴ� �޼ҵ�� ������ �־��ٶ� ����Ѵ�.
		this.price =price;
		
		//Book this�� this,�� �����Ǿ� �ִ°�.
	}
	public int getPrice() {
		return this. price;
		//this�� �����Ǿ� �־��� ��.�����ص� ��.
	}
	public Book getInstance(Book this) {
//		return new Book();	//���ο� ������ ����Ǿ� ������ �ȹ޴´�.
		return this;		//
	}
	
	public static void main(String[] args) {
//	new Book().bookName="�μ��� ����";
//	System.out.println(new Book().bookName);
//	}
//	Book b = new Book();
//	b.bookName="����ó��..";
//	System.out.println(b.bookName);
//		Book book = new Book();
//		book.author="������";
//		System.err.println(book.author);
	}
}//Ŭ���� ����.

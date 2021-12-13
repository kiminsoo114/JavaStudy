package basic.java.chapter8;

public class ExceptionEx4 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
	try {
		System.out.println(3);
		System.out.println(4);
	}catch(Exception e) {
		System.out.println(5);//실행되지 않는다.
	}
	}
}

//예외가 발생하지 않았으므로 catch문은 실행되지 않는다.
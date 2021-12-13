package basic.java.chapter8;

public class ExceptionEx5 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);//실행되지 않는다.
		}catch(ArithmeticException e) {
			System.out.println(5);
			System.out.println(6);
		}
		System.out.println(7);
	}
}
//4가 출력되지 않는 이유는 0/0에서 예외가 발생했음으로 try문을 건너뛰고 catch문으로 이동하여 
//catch문의 내용을 출력을 한후에 try-catch문을 완전히 벗어나서 7을 또 출력하는 것.
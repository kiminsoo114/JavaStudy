package basic.java.chapter8;

public class ExceptionEx3 {
	public static void main(String[] args) {
		int number=100;
		int result=0;
		
		for(int i=0;i<10;i++) {
			try {
				result=number/(int)(Math.random()*10);
				System.out.println(result);
			}catch(ArithmeticException e) {
				System.out.println("0");//ArithmeticException이 발생할 때 실행되는 코드
			}//try-catch의 끝
		}
	}
}

package basic.java.chapter8;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int number = 100;
		int result =0;
		
		for(int i=0;i<10;i++) {
			result = number /(int)(Math.random()*10);
			System.out.println(result);
		}
	}
}


//Math.random은 범위가 0이상 1미만이다.
//따라서 난수발생시에 0이 나올수도 있고 이는 0으로 나눌때 발생하는 ArithmeticException이 발생할 수 도 있는것.
//정수를 0으로 나누는 것은 금지되어있지만 실수를 0으로 나누는 것은 금지되어 있지않다.
package basic.java.chapter8;

public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(Exception e) { //ArithmeticException대신에 Exception을 넣었다.
			System.out.println(5);
		}
		System.out.println(6);
	}
}

/*Exception클래스는 모든 예외클래스의 부모이기에 
 * Exception클래스 타입에 참조변수를 넣으면 어떤 예외가 와도 catch문을 수행한다.
 * 
 */

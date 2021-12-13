package basic.java.chapter8;

public class ExceptionEx1 {

		public static void main(String[] args) {
			try {
				try { } catch (Exception e) {}
				
			}catch(Exception e) {
				try {}catch(Exception e) {} //에러. 변수e가 중복선언 되었다.
			}//try-catch의 끝
		try {
			
		}catch(Exception e) {
			
		}//try-catch의 끝
		
		}//main메서드의 끝
		
}
//아무것도 잃어나지 않으며 단순히 try-catch문의 사용 예를 보여주기 위해서 작성한 코드
//try블럭 또는 catch 블럭에 또 다른 try - catch문이 포함될 수 있다.
//try-catch의 catch 블럭 안에 참조변수 e를 하나만 사용해도 되지만 
//만약 catch블럭안에 또 try- catch문이 있으면 그때는 같은 이름의 참조변수를 사용해서는 안된다.
//각 catch블럭에 선언된 두 참조변수의 영역이 서로 겹치므로 다른이름을 사용해야지 서로 구별되기 때문.
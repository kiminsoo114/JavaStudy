package basicjava.com.scanner;

public class OperatorEx9 {
public static void main(String[] args) {
	long a = 1_000_000 * 1_000_000;  //int타입*int타입은 int타입이 나오고 이미 나온값을 long으로 형변환 해봤자 
	//의미가 없기 때문에 오버플로우 결과값이 나온다.
	long b = 1_000_000 * 1_000_000L; //하나의 값이 long이므로 나머지 int 값도 자동으로 long으로 형변환 되기때문에
	//제대로된 결과값이 호출된다.
	
	System.out.println("a="+a);
	System.out.println("b="+b);
}
}

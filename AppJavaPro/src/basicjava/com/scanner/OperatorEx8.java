package basicjava.com.scanner;

public class OperatorEx8 {
public static void main(String[] args) {
	int a = 1_000_000; //1,000,000 1백만
	int b = 2_000_000; //2,000,000 2백만
	
	long c = a*b;   //int타입과 int타입의 연산결과는 int타입이다. 그러므로 값이 제대로 나오지 않는다.
	System.out.println(c);
}
}

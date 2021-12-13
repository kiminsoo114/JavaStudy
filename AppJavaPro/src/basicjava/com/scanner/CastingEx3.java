package basicjava.com.scanner;

public class CastingEx3 {

	
	public static void main(String[] args) {
		float f =9.1234567f;
		double d =9.1234567;
		double d2 =(double)f;
		//f값은 이미 정의가 되어있었기 때문에 f를 double로 형변환을 한다고 값이 달리지지는 않는다.
		
		System.out.printf("f=%20.18f\n",f);
		System.out.printf("d=%20.18f\n",d);
		System.out.printf("d2=%20.18f\n",d2);
		
	}
}

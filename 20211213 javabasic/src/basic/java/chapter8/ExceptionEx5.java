package basic.java.chapter8;

public class ExceptionEx5 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);//������� �ʴ´�.
		}catch(ArithmeticException e) {
			System.out.println(5);
			System.out.println(6);
		}
		System.out.println(7);
	}
}
//4�� ��µ��� �ʴ� ������ 0/0���� ���ܰ� �߻��������� try���� �ǳʶٰ� catch������ �̵��Ͽ� 
//catch���� ������ ����� ���Ŀ� try-catch���� ������ ����� 7�� �� ����ϴ� ��.
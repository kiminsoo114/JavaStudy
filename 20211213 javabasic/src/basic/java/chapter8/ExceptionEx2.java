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


//Math.random�� ������ 0�̻� 1�̸��̴�.
//���� �����߻��ÿ� 0�� ���ü��� �ְ� �̴� 0���� ������ �߻��ϴ� ArithmeticException�� �߻��� �� �� �ִ°�.
//������ 0���� ������ ���� �����Ǿ������� �Ǽ��� 0���� ������ ���� �����Ǿ� �����ʴ�.
package basicjava.com.scanner;

public class OperatorEx9 {
public static void main(String[] args) {
	long a = 1_000_000 * 1_000_000;  //intŸ��*intŸ���� intŸ���� ������ �̹� ���°��� long���� ����ȯ �غ��� 
	//�ǹ̰� ���� ������ �����÷ο� ������� ���´�.
	long b = 1_000_000 * 1_000_000L; //�ϳ��� ���� long�̹Ƿ� ������ int ���� �ڵ����� long���� ����ȯ �Ǳ⶧����
	//����ε� ������� ȣ��ȴ�.
	
	System.out.println("a="+a);
	System.out.println("b="+b);
}
}

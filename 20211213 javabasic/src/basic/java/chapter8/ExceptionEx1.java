package basic.java.chapter8;

public class ExceptionEx1 {

		public static void main(String[] args) {
			try {
				try { } catch (Exception e) {}
				
			}catch(Exception e) {
				try {}catch(Exception e) {} //����. ����e�� �ߺ����� �Ǿ���.
			}//try-catch�� ��
		try {
			
		}catch(Exception e) {
			
		}//try-catch�� ��
		
		}//main�޼����� ��
		
}
//�ƹ��͵� �Ҿ�� ������ �ܼ��� try-catch���� ��� ���� �����ֱ� ���ؼ� �ۼ��� �ڵ�
//try�� �Ǵ� catch ���� �� �ٸ� try - catch���� ���Ե� �� �ִ�.
//try-catch�� catch �� �ȿ� �������� e�� �ϳ��� ����ص� ������ 
//���� catch���ȿ� �� try- catch���� ������ �׶��� ���� �̸��� ���������� ����ؼ��� �ȵȴ�.
//�� catch���� ����� �� ���������� ������ ���� ��ġ�Ƿ� �ٸ��̸��� ����ؾ��� ���� �����Ǳ� ����.
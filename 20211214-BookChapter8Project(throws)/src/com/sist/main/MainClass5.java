package com.sist.main;
//����� ���� ����ó�� (�ڹٿ��� �������� �ʴ� ���ܰ� �߻��ÿ� ���� ���� ó���ϴ� ��)
//439 page (���󵵴� ���� ����)
//try-catch�� ���� ����� throws ���� ��� �ΰ����� Ȯ���� �˸� �ȴ�.
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);//ExceptionŬ������ ������
	}//this => MyExceptionŬ������ ��ü => static������ �Ǿ�����
}

/*
 * 		class A
 * 		{
 * 		}
 * 		=>1. Ŭ���� ����
 * 			===========
 * 			A a = new A(); //���÷��� Class.forName()
 * 			=> JVM =>this =a; => ��ü���� �ּҸ� ����ϰ� �ִ�
 *			
 *		  2. ���(�ӵ��� ���� => JOIN (Subquery) ==> ����ȭ
 *			�޸� �Ҵ� ==> ��� ������ Ŭ���� �޸� �Ҵ�
 *						  ��� �޴� Ŭ���� �޸� �Ҵ� 		
*/
public class MainClass5 {
	public static void main(String[] args) {
		
	}
}

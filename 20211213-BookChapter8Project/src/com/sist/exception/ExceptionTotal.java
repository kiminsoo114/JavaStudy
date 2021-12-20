package com.sist.exception;

/*	 ����ó�� : ������ ������ ����
 * 		=> ���� : ���α׷��� ����� �߻��� �� �ִ� ������ ���� ����� �ڵ� �ۼ�
 * 										================
 * 		=> ���� ������ ó�� : if������ ó��==> ó���� �Ұ����ϸ� ����ó���� �Ѵ�
 * 		����ó��
 *		=>���� ó�� : try ~ catch ~ finally
 *		(���ܸ� ��Ƽ� ����) => ���ܺ���(catch��)
 *		=>���� ó�� 
 *		=>���� �߻�
 *		=>�������� �ʴ� ���� ó�� ���� (����� ���� ����ó��)
 *
 *1. ����(��������)
 *			��� Ŭ������ �ֻ��� Ŭ����(����� ���� Ŭ����)
 *						Object
 *2. ����				   |
*/
import java.util.*;

public class ExceptionTotal {
	
	public static void main(String[] args) {
		//1. ������ �ΰ� �޾Ƽ� ������ => 0
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ���� �Է�:");
		int no1=scan.nextInt();
		System.out.println("�ι�° ���� �Է�:");
		int no2=scan.nextInt();
		try
		{
			System.out.printf("%d/%d=%d\n",no1,no2,no1/no2);
		}catch(Exception e) {
			System.out.println("0���� ���� �� �����ϴ�!!");
		}
	}
}

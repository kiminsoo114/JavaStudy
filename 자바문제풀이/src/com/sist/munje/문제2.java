package com.sist.munje;

import java.util.Scanner;

/*
 * ���ڸ� �Է¹޾� 3~5�� ��, 6~8�� ����, 9~11�� ����, 12,1,2�� �ܿ�, �� ���� ���ڸ� �Է��� ��� �߸��Է��� ����ϴ� ���α׷��� �ۼ��϶�. if-else ���� switch �� �� �̿��� �� ��.
*/
public class ����2 {
public static void main(String[] args) {
	int num=0;
	Scanner scan= new Scanner(System.in);
	System.out.println("���� �Է��ϼ���(1~12)>>");
	num=scan.nextInt();
	
	switch(num){
	case 12: case 1: case 2:
		System.out.println("�ܿ�");
		break;
	case 3: case 4: case 5:
		System.out.println("��");
		break;
	case 6: case 7: case 8:
		System.out.println("����");
		break;
	case 9: case 10: case 11:
		System.out.println("����");
		break;
	default:
		System.out.println("���ڸ� �ٽ� �Է��ϼ���.");
		}
	
}

}

package basicjava.chapter4;

import java.util.Scanner;

public class FlowEx10 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.print("����� ������ �Է��ϼ���(1~100)>");
		
		Scanner sc=new Scanner(System.in);
		String tmp = sc.nextLine(); //ȭ���� ���� �Է¹��� ������ tmp�� ����.
		score = Integer.parseInt(tmp);//�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ�ؼ� score�� ����.
		
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade='B';
		case 7:
			grade='C';
			break;
		default:
			grade = 'F';
		}
		System.out.println("����� ������ "+grade+" �Դϴ�.");
	}
}

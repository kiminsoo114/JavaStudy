package basicjava.chapter4;

import java.util.Scanner;

public class FlowEx17 {
	public static void main(String[] args) {
		int num=0;
		
		System.out.print("*�� ����� ������ ���� �Է��ϼ���.>");
		
		Scanner sc= new Scanner(System.in);
		String tmp = sc.nextLine();//ȭ���� ���� �Է¹��� ������ tmp�� ����.
		num = Integer.parseInt(tmp);
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-i;j++) {//����� ������ �Ϸ��� j<=i
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}

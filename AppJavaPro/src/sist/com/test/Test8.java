package sist.com.test;

import java.util.Scanner;

public class Test8 {

	
	
	public static void main(String[] args) {
		int menu=0;
		int num=0;
		
		Scanner scanner =new Scanner(System.in);
		
		
		while(true) {
			System.out.println("(1)�ܹ���");
			System.out.println("(2)����");
			System.out.println("(3)������ġ");
			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)");
			
			String tmp= scanner.nextLine();//ȭ�鿡�� �Է¹��� ������ tmp�� ����
			menu=Integer.parseInt(tmp);//�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
			
			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
			break;
			}else if(menu==1) {
				System.out.println("�ܹ��Ÿ� �����ϼ̽��ϴ�. �����մϴ�.");
			}else if(menu==2) {
				System.out.println("���ڸ� �����ϼ̽��ϴ�. �����մϴ�.");
				break;
			}else if(menu==3) {
				System.out.println("������ġ�� �����ϼ̽��ϴ�. �����մϴ�.");
				break;
			}else if(!(1<=menu&&menu<=3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0");
				continue;
			}

		}
	}
}

package com.sist.main;

/*
 * ����ڰ� �⵵/�� ==> ����ڰ� �Է��ϸ� ������ �Ű�����
 * �޷��� ��� => ����
 * 
 * 4�⸶�� ����.
 * 100�⸶�ٴ� ����.
 * 400�⸶�� �ѹ��� ����.
 * 
 * 1. 1�� 1�� 1�� =>�۳⵵������ �� ������ ���ؾ���.
 * 2. ����⵵�� 1������ �Է��� ������ �� �� ��.
 * 3. �Է� �� �޿� 1++
 * ========================================= +
 *  	�ѳ� �� %7 => '����'�� ���´�.
 *   =====> Calendar(Ŭ����)
 * 
 * 
 * 
*/
import java.util.*;
//���� => java.lang.* 
/*
 * public class MainClass extends Object <-extends Object����
 * {
 * public MainClass()<-������ ����
 * {
 * }
 * public void display()
 * {
 * return<-����
 * }
 * }
 * 
 * 
 * 
 * 
*/
public class MainClass {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		//����� �Է� �Ϸ�
		Scanner scan =new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		int year=scan.nextInt();
		
		System.out.print("�� �Է�:");
		int month=scan.nextInt();
		
		//��û�� ������ ���� => 1������ ���� ���ϱ�
		//���⵵���� �ѳ� ���� ���غ��� ��.
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		// ���ޱ����� ��.
		int[] lastday= {31,28,31,30,31,30,
						31,31,30,31,30,31};
		
		if(year%4==0 && year%100!=0||(year%400==0))
		{ 
			lastday[1]=29;		
		}else {
			lastday[1]=28;
		}
		for(int i=0;i<month-1;i++) {
			total+= lastday[i];
		}
		
	total++;//������ ���� ù���� �ϱ����ؼ� ++�� �Ѱ�
		
		//���� ���ϱ�
		int week=total%7;
		
		
			//�̰����� ����ϴ°� ����.
			/*
			 * ���ڿ��� �Է¹޾Ƽ� �Ųٷ� ���.
			 * =========================
			 * �׸������� �о�ͼ� �Ųٷ� ���.
			 * byte[] buffer = fileReader()
			 * 
			 * 
			*/	
		String[] strWeek= {"��","��","ȭ","��","��","��","��"};
		//���� ����� �غ���
		System.out.println(year+"�⵵ "+month+"��");
		for(int i=0;i<strWeek.length;i++) {
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println("\n");
		for(int i=1;i<=lastday[month-1];i++) {
			//System.out.print(i+"\t");
			if(i==1) {//�� ù���� i, ���߿��� ��ĭ�� �ٴ��� �˷��ִ� ��.
				for(int j=0;j<week;j++) {
					System.out.printf("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
		}
		//���
		
	}

}

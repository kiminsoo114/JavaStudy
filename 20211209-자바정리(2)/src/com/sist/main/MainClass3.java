package com.sist.main;
//��� ���ϱ�

import java.util.Scanner;

/*
 * 3���� �л�
 * ����,����,���� ==>����, ���, ��� ���
 * 
 * 
 * 
*/
public class MainClass3 {
	
	public static void main(String[] args) {
		int []kor = new int[3];
		int []eng = new int[3];
		int []math = new int[3];
		int []total = new int[3];
		double []avg = new double[3];
		int []rank = new int[3];
		//double[3][6] hak=new double[3][6]
		//3���̻� ==>�������� ����(�迭) / ��������(x) => Ŭ����
		/*int, String, int (���������� �ٸ��⿡ Ŭ������)
		 * 
		 * ClassA{
		 * int
		 * String
		 * int
		 * }
		*/
	Scanner scan = new Scanner(System.in);
	//system.in => keyboard��� �����ϸ� �ȴ�.
	for(int i =0;i<3;i++) {
		System.out.print((i+1)+"��° ���� ���� �Է�:");
		kor[i]=scan.nextInt();
		System.out.print((i+1)+"��° ���� ���� �Է�:");
		eng[i]=scan.nextInt();
		System.out.print((i+1)+"��° ���� ���� �Է�:");
		math[i]=scan.nextInt();
		
		total[i]=(kor[i]+eng[i]+math[i]);
		avg[i]=total[i]/3.0;
		
	}
	for(int i=0;i<3;i++) {
		rank[i]=1;
		for(int j=0;j<3;j++) {
			if(total[i]<total[j]) {
				rank[i]++;
			}
		}
	}
	for(int i=0;i<3;i++) {
		System.out.printf("%-5d%-5d%-5d%-5d%-8.2f%-5d\n",
		kor[i],eng[i],math[i],total[i],avg[i],rank[i]);
	}
	}
}

package com.sist.main;

import java.util.Scanner;

/*
 * ���
 * =====����=====
 * ���ǹ� : ���� ���ǹ� (if), ���� ���ǹ� (if~else)
 * 			����) if(���ǹ�) => ���ǹ�(true/false) => ����������
 * 												  ��������, �񱳿�����
 * 					{
 * 						������ true�϶� ����
 * 					}
 * 						=> �ʿ��� ���븸 ����� ����
 * 
 * 					if(���ǹ�)
 * 					{
 * 							���� true�϶�
 * 					}		
 * 					else
 * 					{
 * 							���� false�϶�
 * 					}
 * =================================================�� (���׿�����)
 * 
 * 
 * �ݺ���:for , while(�����ͺ��̽�,��ũ��ũ, �������� for������ ���� ����)
 * 		==== for-each �κ�.
 * 
 * 			for
 * 			===> �Ϲ� for
 * 
 * 					  1     2      4
 * 				for(�ʱⰪ; ���ǽ�; ������)
 * 					{      ��    ��
 * 						 ���๮��
 * 						   3			
 * 					}				
 * 					1 -> 2 -> 3 -> 4
 * 					�ʱⰪ => ���� (true) => �Ǹ͹��� => ����
 * 					     2 -> 3 -> 4
 * 					     2 -> 3 -> 4
 * 					     2 -> 3 -> 4
 * 							==false�� ����
 * 			===> for-each
 * 					for(�������� ���� : �迭(�÷���))
 * 					{
 * 						=> �迭�̳� �÷��ǿ� ����� �����͸� ����
 * 					}
 * 
 * 
 * �ݺ���� : break : �ݺ��� �ߴ�
 * 
 * 
 * 
*/
public class MainClass4 {
	public static void main(String[] args) {
		String[] result = {"����" , "����" , "��"};
		//��� ���� ==> 0,1,2
		//��ǻ�Ͱ� ����,����,�� => ����
		int com=(int)(Math.random()*3);
		Scanner scan = new Scanner(System.in);
		System.out.print("����(0),����(1),��(2) �Է�:");
		int user = scan.nextInt();
		
		System.out.println("==========���==========");
		System.out.println("��ǻ��:"+result[com]);
		System.out.println("�����:"+result[user]);
		int r=com-user;
		if(r==-1 || r==2) {
			System.out.println("����ڰ� �̰���ϴ�");
		}
		else if(r==-2 || r==1) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�");
		}
		else
			System.out.println("�����ϴ�");
	}
}

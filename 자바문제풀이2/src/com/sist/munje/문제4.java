package com.sist.munje;

import java.util.Scanner;

public class ����4 {
	public static void main(String[] args) {
		int year=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�:");
		year=scan.nextInt();
		if((year%4==0 &&year%100!=0) || year%400==0) {
			System.out.println(year+"�⵵�� �����Դϴ�");
		}
		else {
			System.out.println(year+"�⵵�� ������ �ƴմϴ�.");
		}
			
	}
}

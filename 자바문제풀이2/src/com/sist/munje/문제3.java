package com.sist.munje;

import java.util.Scanner;

public class ����3 {
	public static void main(String[] args) {
		int num=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�:");
		num=scan.nextInt();
		
		if(num<0) {
			num=-num;
	}
		//System.out.println(num+"�� ���밪�� "+Math.abs(num)); �̷��� ���°��� �� ���
		
	System.out.println("a="+num);	
	}
}

package com.sist.munje;

import java.util.Scanner;

public class ����2 {
	public static void main(String[] args) {
		int num=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�:");
		num=scan.nextInt();
		if(num%3==0) {
			System.out.println(num+"��(��) 3�� ����Դϴ�.");
		}
		else if(num%3!=0){
			System.out.println(num+"��(��) 3�� ����� �ƴմϴ�.");
		}
	}
}

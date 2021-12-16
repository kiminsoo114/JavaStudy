package com.sist.munje;

import java.util.Scanner;

public class 문제11 {
	public static void main(String[] args) {
		int num=0; int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		num=scan.nextInt();
		for(int i=1;i<=num;i++) {
			sum +=i;
		}
		System.out.printf("1~%d까지의 합: %d",num,sum);
		
	}
}

package com.sist.munje;

import java.util.Scanner;

public class 문제2 {
	public static void main(String[] args) {
		int num=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		num=scan.nextInt();
		if(num%3==0) {
			System.out.println(num+"는(은) 3의 배수입니다.");
		}
		else if(num%3!=0){
			System.out.println(num+"는(은) 3의 배수가 아닙니다.");
		}
	}
}

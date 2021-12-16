package com.sist.munje;

import java.util.Scanner;

public class 문제7 {
	public static void main(String[] args) {
		int num=0; int num1=0;
		String str=" ";
		Scanner scan =new Scanner(System.in);
		System.out.print("정수입력:");
		num=scan.nextInt();
		System.out.print("+,-,*,/ 입력:");
		str=scan.next();
		System.out.print("정수입력:");
		num1=scan.nextInt();
		try {
		switch(str) {
		case "+":
			System.out.println(num+" + "+num1+" = "+num+num1);
			break;
		case "-":
			System.out.println(num+" - "+num1+" = "+(num-num1));
			break;
		case "*":
		System.out.println(num+" * "+num1+" = "+num*num1);
			break;
		case "/":
			System.out.println(num+" / "+num1+" = "+num/num1);
			default:
				System.err.println("조건에 맞게 입력하세요.");
		}
		}catch(ArithmeticException e) {
			System.err.println("0으로 나눌 수 없습니다.");
		}
		
	}
}

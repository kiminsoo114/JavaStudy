package com.sist.munje;

import java.util.Scanner;

public class ����7 {
	public static void main(String[] args) {
		int num=0; int num1=0;
		String str=" ";
		Scanner scan =new Scanner(System.in);
		System.out.print("�����Է�:");
		num=scan.nextInt();
		System.out.print("+,-,*,/ �Է�:");
		str=scan.next();
		System.out.print("�����Է�:");
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
				System.err.println("���ǿ� �°� �Է��ϼ���.");
		}
		}catch(ArithmeticException e) {
			System.err.println("0���� ���� �� �����ϴ�.");
		}
		
	}
}

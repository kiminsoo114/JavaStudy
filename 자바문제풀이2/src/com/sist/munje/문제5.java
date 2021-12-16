package com.sist.munje;

import java.util.Scanner;

public class 문제5 {
	public static void main(String[] args) {
		int num=0;
		char grade=' ';
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		num=scan.nextInt();
		if(num>=90 && num<=100) {
			grade='A';
			System.out.println(grade+"학점입니다.");
		}if(num>=80 && num<=89) {
			grade='B';
			System.out.println(grade+"학점입니다.");
		}if(num>=70 && num<=79) {
			grade='C';
			System.out.println(grade+"학점입니다.");
		}if(num>=60 && num<=69) {
			grade='D';
			System.out.println(grade+"학점입니다.");
		}if(num>100) {
			System.err.println("다시 입력하세요.");
		}else{
			grade='F';
			System.out.println(grade+"학점입니다.");
		}
		
	}
}

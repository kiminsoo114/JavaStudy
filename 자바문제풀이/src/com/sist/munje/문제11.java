package com.sist.munje;

import java.util.Scanner;

public class 문제11 {
	public static void main(String[] args) {
		int num=0;
		Scanner scan= new Scanner(System.in);
		num=scan.nextInt();
		if(num>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
			
		}
		
	}
}

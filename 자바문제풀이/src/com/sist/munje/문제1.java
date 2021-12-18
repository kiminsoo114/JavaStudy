package com.sist.munje;

import java.util.Scanner;

public class 문제1 {
	public static void main(String[] args) {
		int num=0;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		String a = String.valueOf(num);
		if(num>=10 && num<=99) {
			if(a.charAt(0)==a.charAt(1)) {
				System.out.println("10의 자리와 1의 자리가 같습니다.");
			}
			
		}
		
	}
}

package com.sist.munje;

import java.util.Scanner;

public class 문제3 {
	public static void main(String[] args) {
		int num=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		num=scan.nextInt();
		
		if(num<0) {
			num=-num;
	}
		//System.out.println(num+"의 절대값은 "+Math.abs(num)); 이렇게 쓰는것이 더 깔끔
		
	System.out.println("a="+num);	
	}
}

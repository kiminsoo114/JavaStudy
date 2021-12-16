package com.sist.munje;

import java.util.Scanner;

public class 문제1 {
 public static void main(String[] args) {
	 int num=0;
	Scanner scan=new Scanner(System.in);
	System.out.print("정수 입력:");
	num=scan.nextInt();
//	if(num>0) {
//		System.out.println(num+"는(은) 양수입니다.");
//	}else if(num<0) {
//		System.out.println(num+"는(은) 음수입니다.");
//	}else if(num==0){
//		System.out.println(num+"는(은) 0입니다.");
//	}
	System.out.println(num>0?num+"는(은) 양수입니다.":num+"는(은) 음수입니다.");
}
}

package com.sist.munje;

import java.util.Scanner;

public class ����1 {
 public static void main(String[] args) {
	 int num=0;
	Scanner scan=new Scanner(System.in);
	System.out.print("���� �Է�:");
	num=scan.nextInt();
//	if(num>0) {
//		System.out.println(num+"��(��) ����Դϴ�.");
//	}else if(num<0) {
//		System.out.println(num+"��(��) �����Դϴ�.");
//	}else if(num==0){
//		System.out.println(num+"��(��) 0�Դϴ�.");
//	}
	System.out.println(num>0?num+"��(��) ����Դϴ�.":num+"��(��) �����Դϴ�.");
}
}

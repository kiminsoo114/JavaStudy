package com.sist.munje;

public class 문제9 {
	public static void main(String[] args) {
		int sum=0; int sum1=0;
		for(int i=1; i<=1000; i++) {
			if(i%7==0) {
				sum+=i;
			}
		}
		for(int j=1;j<=1000;j++) {
			if(j%9==0) {
				sum1+=j;
			}
		}
		System.out.println("7의 배수:"+sum);
		System.out.println("9의 배수:"+sum1);
		System.out.println(sum+sum1);
	}
}

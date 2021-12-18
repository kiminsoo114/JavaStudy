package com.sist.munje;
//100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성
public class 문제5 {
	public static void main(String[] args) {
		int sum=0;
		int count=0;
		for(int i=100;i<=999;i++) {
			if(i%7==0) {
				sum +=i;
				count++;
			}
		}
		System.out.println("갯수:"+count);
		System.out.println("합:"+sum);
	}
}

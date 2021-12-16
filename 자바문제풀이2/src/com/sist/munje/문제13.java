package com.sist.munje;

public class 문제13 {
	public static void main(String[] args) {
		int sum=0; 
		int sum1=0;
		for(int i=1;i<=9;i+=2) {
			sum += i;
		}
			for(int j=2;j<=10;j+=2) {
				sum1 += j;				
			}
			System.out.println("1-2+3..-10까지의 합:"+(sum-sum1));
		}
		
	}

//if(i%2==0) {
//	sum-=i;
//else {
//	sum=-i;
//}
	

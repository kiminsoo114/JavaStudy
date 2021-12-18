package com.sist.munje;

public class 문제12 {
	public static void main(String[] args) {
		int[]num= {94,85,95,88,90};
		int max=num[0];
		int min=num[0];
		
		for(int i=0;i<num.length;i++) {
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}
}

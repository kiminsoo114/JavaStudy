package com.sist.munje;

public class ����7 {
public static void main(String[] args) {
	int sum=0; int sum1=0;
	for(int i=1;i<=30;i++) {
		if(i%2==0) {
			sum+=i;
			}
		
		
	}
	System.out.println("¦����:"+sum);
	for(int j=1;j<=30;j++) {
		if(j%2!=0) {
			sum1+=j;
		}
	}
	
	System.out.println("Ȧ����:"+sum1);
}
}
package com.sist.munje;

public class ����13 {
	public static void main(String[] args) {
		int[]num=new int[10]; int sum=0;
		for(int j=0;j<num.length;j++) {//�迭�� ����
			int i=(int)(Math.random()*10)+1;
			sum+=i;
			num[j]=i;
		}
		for(int i=0;i<num.length;i++) {
			System.out.printf("%d  ",num[i]);
		}
		System.out.println();
	double avg=(double)sum/10;
	System.out.println("���:"+avg);
	}
}

package com.sist.munje;
//100~999 ������ 4�ǹ���� �ƴ� ���� ����,���� ����ϴ� ���α׷� �ۼ�
public class ����6 {
	public static void main(String[] args) {
		int sum=0;
		int count=0;
		for(int i=100;i<=999;i++) {
			if(i%4!=0) {
				sum +=i;
				count++;
			}
		}
		System.out.println("����:"+count);
		System.out.println("��:"+sum);
	}
}

package com.sist.munje;
//100~999���̿� 7�� ����� ������ ���� ����ϴ� ���α׷� �ۼ�
public class ����5 {
	public static void main(String[] args) {
		int sum=0;
		int count=0;
		for(int i=100;i<=999;i++) {
			if(i%7==0) {
				sum +=i;
				count++;
			}
		}
		System.out.println("����:"+count);
		System.out.println("��:"+sum);
	}
}

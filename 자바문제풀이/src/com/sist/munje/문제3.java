package com.sist.munje;

public class ����3 {
	public static void main(String[] args) {
		int sum=0, i=1;
		while (i<100) {
		    if(i%3 != 0) {
		        i++;
		        continue;
		    }
		    else sum += i;
		    i++;
		}
		System.out.println("3�� ����� ��>>"+i);
	}
}

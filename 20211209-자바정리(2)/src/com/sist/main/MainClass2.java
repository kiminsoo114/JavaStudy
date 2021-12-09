package com.sist.main;

import java.util.Arrays;

//버블 정렬
/*
 * 45, 67, 90, 34, 12
 * ==  ==
 * 67  45
 * 	   ==  ==
 *	   90  45
 *         ==  == 
 *         45  34 
 *             ==   ==
 *             34   12
 *    ========================= for 1         
 *             
*/          


public class MainClass2 {
	public static void main(String[] args) {
		
		int[]arr = {45,67,90,34,12};
		System.out.println("정렬 전: ");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		System.out.println("정렬 후: ");
		System.out.println(Arrays.toString(arr));
		
	}
}

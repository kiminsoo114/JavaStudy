package com.sist.main;
//제어문 사용법 정리
//메소드 정리
//객체지향 정리 ==>(내일) 내부 클래스 
//오류없는 프로그램을 짜기(예외처리)
/* 단일 조건문
 * 다중 조건문
 * 
 * 1~100까지 ==>3의배수, 5의배수, 7의배수 합을 구해라
 * ㄴ 이런경우에는 단일 조건문 사용.(여러번을 동시에 수행)
 * 다중 조건문은 한번만 하고 빠져나올때 사용.
 * 
 * 제어문 => 조건문이 어렵다.
 *  포함	: && ==> 페이징(어디서부터 어디까지)
 *  미포함 : ||(범위를 벗어나는 경우 쓰는 형식)
 *  
 *  
 *  
*/

import java.util.Arrays;

//1장~8장
public class MainClass {
	
	public static void main(String[] args) {
		//정렬 : 1.선택정렬 2.버블정렬 ==> ORDER BY no DESC
		System.out.println("ASC");
		int []arr = {45,67,90,34,12};
//		Arrays.sort(arr);//ASC(올림차
//		for(int i:arr) {
//			System.out.print(i+" ");
//		}
//		System.out.println("\nDESC");
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
				
			}
		System.out.println(Arrays.toString(arr));		
		}//Arrays.toSTring(arr)= 배열을 문자열로 출력
	}
}

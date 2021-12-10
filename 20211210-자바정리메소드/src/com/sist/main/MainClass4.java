package com.sist.main;

import java.util.Scanner;

/*
 * 제어문
 * =====형식=====
 * 조건문 : 단일 조건문 (if), 선택 조건문 (if~else)
 * 			형식) if(조건문) => 조건문(true/false) => 부정연산자
 * 												  논리연산자, 비교연산자
 * 					{
 * 						조건이 true일때 수행
 * 					}
 * 						=> 필요한 내용만 출력이 가능
 * 
 * 					if(조건문)
 * 					{
 * 							조건 true일때
 * 					}		
 * 					else
 * 					{
 * 							조건 false일때
 * 					}
 * =================================================웹 (삼항연산자)
 * 
 * 
 * 반복문:for , while(데이터베이스,네크워크, 웹에서는 for문보다 많이 쓰임)
 * 		==== for-each 부분.
 * 
 * 			for
 * 			===> 일반 for
 * 
 * 					  1     2      4
 * 				for(초기값; 조건식; 증감식)
 * 					{      ↓    ↗
 * 						 실행문장
 * 						   3			
 * 					}				
 * 					1 -> 2 -> 3 -> 4
 * 					초기값 => 조건 (true) => 실맹문장 => 증가
 * 					     2 -> 3 -> 4
 * 					     2 -> 3 -> 4
 * 					     2 -> 3 -> 4
 * 							==false면 종료
 * 			===> for-each
 * 					for(데이터형 변수 : 배열(컬렉션))
 * 					{
 * 						=> 배열이나 컬렉션에 저장된 데이터를 대입
 * 					}
 * 
 * 
 * 반복제어문 : break : 반복을 중단
 * 
 * 
 * 
*/
public class MainClass4 {
	public static void main(String[] args) {
		String[] result = {"가위" , "바위" , "보"};
		//모든 가상 ==> 0,1,2
		//컴퓨터가 가위,바위,보 => 선택
		int com=(int)(Math.random()*3);
		Scanner scan = new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2) 입력:");
		int user = scan.nextInt();
		
		System.out.println("==========결과==========");
		System.out.println("컴퓨터:"+result[com]);
		System.out.println("사용자:"+result[user]);
		int r=com-user;
		if(r==-1 || r==2) {
			System.out.println("사용자가 이겼습니다");
		}
		else if(r==-2 || r==1) {
			System.out.println("컴퓨터가 이겼습니다");
		}
		else
			System.out.println("비겼습니다");
	}
}

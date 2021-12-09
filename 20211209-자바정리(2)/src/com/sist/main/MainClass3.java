package com.sist.main;
//등수 구하기

import java.util.Scanner;

/*
 * 3명의 학생
 * 국어,영어,수학 ==>총점, 평균, 등수 출력
 * 
 * 
 * 
*/
public class MainClass3 {
	
	public static void main(String[] args) {
		int []kor = new int[3];
		int []eng = new int[3];
		int []math = new int[3];
		int []total = new int[3];
		double []avg = new double[3];
		int []rank = new int[3];
		//double[3][6] hak=new double[3][6]
		//3개이상 ==>데이터형 같다(배열) / 데이터형(x) => 클래스
		/*int, String, int (데이터형이 다르기에 클래스로)
		 * 
		 * ClassA{
		 * int
		 * String
		 * int
		 * }
		*/
	Scanner scan = new Scanner(System.in);
	//system.in => keyboard라고 생각하면 된다.
	for(int i =0;i<3;i++) {
		System.out.print((i+1)+"번째 국어 점수 입력:");
		kor[i]=scan.nextInt();
		System.out.print((i+1)+"번째 영어 점수 입력:");
		eng[i]=scan.nextInt();
		System.out.print((i+1)+"번째 수학 점수 입력:");
		math[i]=scan.nextInt();
		
		total[i]=(kor[i]+eng[i]+math[i]);
		avg[i]=total[i]/3.0;
		
	}
	for(int i=0;i<3;i++) {
		rank[i]=1;
		for(int j=0;j<3;j++) {
			if(total[i]<total[j]) {
				rank[i]++;
			}
		}
	}
	for(int i=0;i<3;i++) {
		System.out.printf("%-5d%-5d%-5d%-5d%-8.2f%-5d\n",
		kor[i],eng[i],math[i],total[i],avg[i],rank[i]);
	}
	}
}

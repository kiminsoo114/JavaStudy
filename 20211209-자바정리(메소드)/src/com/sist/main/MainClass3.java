package com.sist.main;

import java.util.Scanner;

public class MainClass3 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year= scan.nextInt();
		System.out.print("월 입력: ");
		int month= scan.nextInt();
		
		int total = (year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			lastday[1]=29;
		}else {
			lastday[1]=28;
		}
		
		for(int i=0; i<month-1; i++) {
			total+=lastday[i];
		}
		total++;
		
		int week=total%7;
		
		String [] str = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(year+"년도 "+month+"월");
		
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i]+"\t");
		}
		System.out.println("\n");
		
		for(int i=1;i<=lastday[month-1];i++) {
			if(i==1) {
				for(int j=0; j<week;j++) {
					System.out.print("\t");// 1일이 시작자리를 정하는 것
					//1의 시작자리전까지는 탭을 해서 빈칸을 만들어주는 것.
				}
			
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				week=0;
				System.out.println(); //줄을 넘기는 소스
			}
		}
	}
}

package com.sist.main;

/*
 * 사용자가 년도/월 ==> 사용자가 입력하면 무조건 매개변수
 * 달력을 출력 => 윤년
 * 
 * 4년마다 윤년.
 * 100년마다는 제외.
 * 400년마다 한번씩 윤년.
 * 
 * 1. 1년 1월 1일 =>작년도까지의 총 날수를 구해야함.
 * 2. 현재년도의 1월부터 입력한 월까지 총 날 수.
 * 3. 입력 한 달에 1++
 * ========================================= +
 *  	총날 수 %7 => '요일'이 나온다.
 *   =====> Calendar(클래스)
 * 
 * 
 * 
*/
import java.util.*;
//생략 => java.lang.* 
/*
 * public class MainClass extends Object <-extends Object생략
 * {
 * public MainClass()<-생성자 생략
 * {
 * }
 * public void display()
 * {
 * return<-생략
 * }
 * }
 * 
 * 
 * 
 * 
*/
public class MainClass {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//사용자 입력 완료
		Scanner scan =new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		System.out.print("월 입력:");
		int month=scan.nextInt();
		
		//요청한 내용을 가공 => 1일자의 요일 구하기
		//전년도까지 총날 수를 구해보는 것.
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		// 전달까지의 합.
		int[] lastday= {31,28,31,30,31,30,
						31,31,30,31,30,31};
		
		if(year%4==0 && year%100!=0||(year%400==0))
		{ 
			lastday[1]=29;		
		}else {
			lastday[1]=28;
		}
		for(int i=0;i<month-1;i++) {
			total+= lastday[i];
		}
		
	total++;//선택한 달의 첫날을 하기위해서 ++를 한것
		
		//요일 구하기
		int week=total%7;
		
		
			//이공식은 기억하는게 좋음.
			/*
			 * 문자열을 입력받아서 거꾸로 출력.
			 * =========================
			 * 그림파일을 읽어와서 거꾸로 출력.
			 * byte[] buffer = fileReader()
			 * 
			 * 
			*/	
		String[] strWeek= {"일","월","화","수","목","금","토"};
		//요일 출력을 해보자
		System.out.println(year+"년도 "+month+"월");
		for(int i=0;i<strWeek.length;i++) {
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println("\n");
		for(int i=1;i<=lastday[month-1];i++) {
			//System.out.print(i+"\t");
			if(i==1) {//맨 첫줄이 i, 그중에서 몇칸을 뛰는지 알려주는 것.
				for(int j=0;j<week;j++) {
					System.out.printf("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
		}
		//출력
		
	}

}

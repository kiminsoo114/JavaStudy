package com.sist.exception;

/*	 예외처리 : 수정이 가능한 에러
 * 		=> 정의 : 프로그램을 실행시 발생할 수 있는 에러에 대한 대비한 코드 작성
 * 										================
 * 		=> 아주 간단한 처리 : if문으로 처리==> 처리가 불가능하면 예외처리를 한다
 * 		예외처리
 *		=>직접 처리 : try ~ catch ~ finally
 *		(예외를 잡아서 복구) => 예외복구(catch절)
 *		=>간접 처리 
 *		=>직접 발생
 *		=>지원하지 않는 예외 처리 제작 (사용자 정의 예외처리)
 *
 *1. 순서(계층구조)
 *			모든 클래스의 최상위 클래스(사용자 정의 클래스)
 *						Object
 *2. 사용법				   |
*/
import java.util.*;

public class ExceptionTotal {
	
	public static void main(String[] args) {
		//1. 정수를 두개 받아서 나누기 => 0
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		int no1=scan.nextInt();
		System.out.println("두번째 정수 입력:");
		int no2=scan.nextInt();
		try
		{
			System.out.printf("%d/%d=%d\n",no1,no2,no1/no2);
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다!!");
		}
	}
}

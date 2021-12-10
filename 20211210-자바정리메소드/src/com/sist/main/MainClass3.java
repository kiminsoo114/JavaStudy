package com.sist.main;

/*
 * 메소드 요소
 * ===변수 + 연선자 + 제어문
 *  연산자 : 증감(++,--), 산술, 비교, 논리
 *  	==============전치 / 후치
 *  				++a     a++
 *  
 *  int a = 10;
 *  int b = ++a + a++ + a++ + ++a  
 *           11    11    12    14   ===>48
 *           
 *  int a = 10;
 *  int b = ++a + ++a + ++a + ++a       
 * 
 * int a =10;
 * int b = ++a; 증가하고 대입
 * 
 * int b = a++; 대입하고 증가
 * 
 * 
*/
public class MainClass3 {
	public static void main(String[] args) {
		 int a = 10;
		 int b = ++a + ++a + ++a + ++a;
		 
		 int c = 10;
		 int d = ++c + c++ + c++ + ++c; 
		 
		 System.out.println(b);
		 System.out.println(d);
	}
}

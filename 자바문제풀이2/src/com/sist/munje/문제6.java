package com.sist.munje;

import java.util.Scanner;

public class 문제6 {
	public static void main(String[] args) {
		int num=0;
		char grade=' ';
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		num=scan.nextInt();
		
		switch(num) {
		case 90: case 91: case 92: case 93: case 94:
		case 95: case 96: case 97: case 98: case 99: case 100:
			grade='A';
		}
		switch(num) {
		case 80: case 81: case 82: case 83: case 84: case 85:
		case 86: case 87: case 88: case 89:
			grade='B';
		break;
	
		case 70: case 71: case 72: case 73: case 74: case 75:
		case 76: case 77: case 78: case 79:
			grade='C';
		break;
		
		case 60: case 61: case 62: case 63: case 64: case 65:
		case 66: case 67: case 68: case 69:
			grade='D';
		break;
		default:
			grade='F';
		System.out.println(grade+"학점입니다.");
	}
}
}
//}			Scanner scan = new Scanner(System.in);
//		char hak;
//		try {
//			while (true) {
//				System.out.print("정수 입력 : ");
//				int input = scan.nextInt();
//				if (input < 0 || input > 100) {
//					System.out.println("0~100사이의 점수를 입력하시오");
//					continue;
//				}
//				
//				switch(input/10) {
//				case 9,10: 
//					hak ='A';
//					break;
//				case 8: 
//					hak ='B';
//					break;
//				case 7: 
//					hak ='C';
//					break;
//				case 6: 
//					hak ='D';
//					break;
//				default:
//						hak='F';
//				}
//				System.out.println(hak +"학점입니다");
//				break;
//			}
//		} catch (Exception e) {
//			System.out.println("정수를 입력하시오");
//			e.printStackTrace();
//		}
//	}


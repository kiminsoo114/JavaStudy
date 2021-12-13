package basicjava.chapter4;

import java.util.Scanner;

public class FlowEx7 {
	public static void main(String[] args) {
		System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요.>");
		
		Scanner scanner =new Scanner(System.in);
		int user =scanner.nextInt();//입력한 내용을 user에 저장함.
		int com =(int)(Math.random()*3)+1;
		
		switch(user-com) {
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case-2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;//마지막 문장임으로 break를 사용할 필요는 사실 없다.
		}
	}
}

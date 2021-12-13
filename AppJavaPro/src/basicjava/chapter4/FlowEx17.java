package basicjava.chapter4;

import java.util.Scanner;

public class FlowEx17 {
	public static void main(String[] args) {
		int num=0;
		
		System.out.print("*을 출력한 라인의 수를 입력하세요.>");
		
		Scanner sc= new Scanner(System.in);
		String tmp = sc.nextLine();//화면을 통해 입력받은 내용을 tmp에 저장.
		num = Integer.parseInt(tmp);
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-i;j++) {//모양을 역으로 하려면 j<=i
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}

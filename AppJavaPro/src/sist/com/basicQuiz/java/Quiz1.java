package sist.com.basicQuiz.java;

import java.util.Scanner;

public class Quiz1 {
	private Scanner scanner;
	private Quiz2 []quizArray;
	private int index;
	
	public Quiz1() {
		scanner = new Scanner(System.in);
		System.out.println("clientCount:");
		quizArray = new Quiz2[scanner.nextInt()];
	}
	public void objectpro1() {

		String s1 ="�ּ���#881210-1010547#031)457-1280";
		String s2 ="������#981210-3010547#02)467-1280";
		String s3 ="������#891210-2010547#031)477-1280";
		String s4 ="���μ�#581210-1010547#02)457-1280";
		String []strArray=s2.split("#");
		for(String s:strArray) {
			System.out.println(s);
		}
	}
	
	//�̸�,����,���û���,����,����,��
//	public void stringProcess() {
//		String[]data = {"�ּ���#881210-1010547#031)457-1280"
//				        ,"������#981210-3010547#02)467-1280"
//				        ,"������#891210-2010547#031)477-1280"
//				        ,"���μ�#581210-1010547#02)457-1280"};
//	}
	
	
	public static void main(String[] args) {
		Quiz1 o=new Quiz1();
		o.objectpro1();
	}
}

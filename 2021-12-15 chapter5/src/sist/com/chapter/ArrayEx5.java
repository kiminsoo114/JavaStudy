package sist.com.chapter;

public class ArrayEx5 {
	public static void main(String[] args) {
		int sum=0;
		double avg =0;
		
		int[] score = {100,88,100,100,90};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		avg = sum/(double)score.length; //������� ����� ��� ���� ����ȯ.
		
		System.out.println("����: "+sum);
		System.out.println("���: "+avg);
	}
}

package sist.com.chapter;

public class ArrayEx5 {
	public static void main(String[] args) {
		int sum=0;
		double avg =0;
		
		int[] score = {100,88,100,100,90};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		avg = sum/(double)score.length; //계산결과를 더블로 얻기 위한 형변환.
		
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
	}
}

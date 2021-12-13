package sist.com.array;

import java.util.Scanner;

public class Test7 {
Scanner scanner=new Scanner(System.in);
	public int max(int []m) {
		int maxValue=0;
		for (int i= 0;  i< m.length;i++) {
			if(m[i]>maxValue)
		maxValue=m[i];
		}
		return maxValue;
			
	}
	public int min(int []m) {
		int minValue=m[0];
		for (int i = 0; i < m.length; i++) {
			if(m[i]<minValue)
				minValue=m[i];
		}
		return minValue;
	}
	public int abs(int data) {
		return data<0?-data:data;
	}
	
	
	
	public int near(int []data,int target) {
		//근가값= 차액=데이터-특정값
		int near=0,gab=0,mingab=data[0]-target;
		for (int i = 0; i < data.length; i++) {
			gab=data[i]-target;
			if(abs(gab)<=abs(mingab)) {
				mingab=gab;
				near=data[i];
			}
		}
		return near;
	}
	
	public double average(int []m) {
		int sum = 0;
		for(int i=0; i<m.length; i++) sum += m[i];
		return sum/(double)m.length;
		}
		
	public int overAverage(int[] m, double average) {

		int cnt=0;
		for(int i=0; i<m.length; i++)
			if(m[i]>=average) cnt++;
		return cnt;
	}
	
	public void rank(int []m) {

		for (int i = 0; i < m.length; i++) {
			m[] =1;
			for (int j = 0; j < m.length; j++) {
				if(m[i]<m[j]) {
					rank++;
				
			}
				}

				
			}
			
		}
		
		
	}

	   

					
				
				
			
			
			
		
	
	
	public static void main(String[] args) {
		Test7 t=new Test7();
		int []m= {10,95,100,27,85};
		System.out.println("최대값="+t.max(m));
		System.out.println("최소값="+t.min(m));
		System.out.println("근사값="+t.near(m, 20));
		System.out.println("평균="+t.average(m));
		System.out.println("평균 이상 개수="+t.overAverage(m, 63.4));
		System.out.println("석차="+t.rank(m));
	}
}

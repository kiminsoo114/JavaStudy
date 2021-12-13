package sist.com.array;
import java.util.Scanner;

public class ArrayEx5 {
	
	Scanner scanner=new Scanner(System.in);
	
	// 최대값
	public int getMax(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++)
			if(arr[i]>max) max=arr[i];
		return max;
	}

	// 최소값
	public int getMin(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) min=arr[i];
		}
		return min;
	}

	// 근사값
	public int getClosest(int comp, int[] arr) {
		
		int diff = Integer.MAX_VALUE;
		int closest = 0;
		
		for(int i=0; i<arr.length; i++) {
			if (Math.abs(arr[i]-comp) < diff) {
				diff = Math.abs(arr[i]-comp);
				closest = arr[i];
			}
		}
		return closest;
	}
	
	// 평균값
	public double getAverage(int[] arr) {
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) sum += arr[i];
		return sum/(double)arr.length;
	}
	
	// 평균값 이상 개수
	public int overAverage(int[] arr, double average) {

		int cnt=0;
		for(int i=0; i<arr.length; i++)
			if(arr[i]>=average) cnt++;
		return cnt;
	}
	
	public void getInput() {
		System.out.println("1. 배열 만들기");
		System.out.println("배열 크기 입력:");
		int n = scanner.nextInt();
		
		int []arr=new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.println((i+1)+"번째 배열 값 입력:");
			arr[i] = scanner.nextInt();
		}

		System.out.println("근사값 비교 숫자 입력:");
		int comp = scanner.nextInt();
		
		int max = getMax(arr);
		int min = getMin(arr);
		int closest = getClosest(comp, arr);
		double average = getAverage(arr);
		int overAvg = overAverage(arr, average);
		
		System.out.println();
		disp(max, min, comp, closest, average, overAvg);
	}
	
	public void disp(int max, int min, int comp, int closest, double average, int overAvg) {
		System.out.println("최대 값은: " + max);
		System.out.println("최소 값은: " + min);
		System.out.println(comp+"의 근사 값은: " + closest);
		System.out.println("평균 값은: " + average);
		System.out.println("평균 이상 개수: " + overAvg);
	}

	public static void main(String[] args) {
		ArrayEx5 a = new ArrayEx5();
		a.getInput();
	}
}

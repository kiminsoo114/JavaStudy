package sist.com.array;
import java.util.Scanner;

public class ArrayEx5 {
	
	Scanner scanner=new Scanner(System.in);
	
	// �ִ밪
	public int getMax(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++)
			if(arr[i]>max) max=arr[i];
		return max;
	}

	// �ּҰ�
	public int getMin(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) min=arr[i];
		}
		return min;
	}

	// �ٻ簪
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
	
	// ��հ�
	public double getAverage(int[] arr) {
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) sum += arr[i];
		return sum/(double)arr.length;
	}
	
	// ��հ� �̻� ����
	public int overAverage(int[] arr, double average) {

		int cnt=0;
		for(int i=0; i<arr.length; i++)
			if(arr[i]>=average) cnt++;
		return cnt;
	}
	
	public void getInput() {
		System.out.println("1. �迭 �����");
		System.out.println("�迭 ũ�� �Է�:");
		int n = scanner.nextInt();
		
		int []arr=new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.println((i+1)+"��° �迭 �� �Է�:");
			arr[i] = scanner.nextInt();
		}

		System.out.println("�ٻ簪 �� ���� �Է�:");
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
		System.out.println("�ִ� ����: " + max);
		System.out.println("�ּ� ����: " + min);
		System.out.println(comp+"�� �ٻ� ����: " + closest);
		System.out.println("��� ����: " + average);
		System.out.println("��� �̻� ����: " + overAvg);
	}

	public static void main(String[] args) {
		ArrayEx5 a = new ArrayEx5();
		a.getInput();
	}
}

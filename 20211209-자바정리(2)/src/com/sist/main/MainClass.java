package com.sist.main;
//��� ���� ����
//�޼ҵ� ����
//��ü���� ���� ==>(����) ���� Ŭ���� 
//�������� ���α׷��� ¥��(����ó��)
/* ���� ���ǹ�
 * ���� ���ǹ�
 * 
 * 1~100���� ==>3�ǹ��, 5�ǹ��, 7�ǹ�� ���� ���ض�
 * �� �̷���쿡�� ���� ���ǹ� ���.(�������� ���ÿ� ����)
 * ���� ���ǹ��� �ѹ��� �ϰ� �������ö� ���.
 * 
 * ��� => ���ǹ��� ��ƴ�.
 *  ����	: && ==> ����¡(��𼭺��� ������)
 *  ������ : ||(������ ����� ��� ���� ����)
 *  
 *  
 *  
*/

import java.util.Arrays;

//1��~8��
public class MainClass {
	
	public static void main(String[] args) {
		//���� : 1.�������� 2.�������� ==> ORDER BY no DESC
		System.out.println("ASC");
		int []arr = {45,67,90,34,12};
//		Arrays.sort(arr);//ASC(�ø���
//		for(int i:arr) {
//			System.out.print(i+" ");
//		}
//		System.out.println("\nDESC");
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
				
			}
		System.out.println(Arrays.toString(arr));		
		}//Arrays.toSTring(arr)= �迭�� ���ڿ��� ���
	}
}

package beyual.test1;

import java.util.Scanner;

public class All {
   
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
	      
	      for(int i=0; i<arr.length; i++)
	         if(arr[i]<min) min=arr[i];

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


	   // ��������
	   public int[] sorting(int[] arr) {
	      // �迭 ����
	      int[] sortedarr = arr.clone();
	      int temp = 0;
	      for(int i=0; i<sortedarr.length-1; i++) {
	         for(int j=0; j<sortedarr.length-1;  j++) {
	            // �� ���ڰ� ���� ���ں��� ũ�� ����
	            if(sortedarr[j]>sortedarr[j+1]) {
	               temp = sortedarr[j];
	               sortedarr[j] = sortedarr[j+1];
	               sortedarr[j+1]= temp;
	            }
	         }
	      }
	      return sortedarr;
	   }
	   
	   // �ֺ�
	   public void getMode(int[] sortedarr) {
	      
	      int[] cnt = new int[sortedarr.length];      

	      for(int i=0; i<sortedarr.length; i++) {
	         for(int j=0; j<sortedarr.length; j++) {
	            if(sortedarr[i]==sortedarr[j]) {
	               cnt[i]++;
	            }
	         }
	        }
	      
	      int temp = 0;
	      for(int i=0; i<cnt.length; i++) 
	         if(temp<=cnt[i]) temp=cnt[i];

	      System.out.print("�ֺ�: ");
	      int temp2=0;
	      for(int i=0; i<cnt.length; i++) {
	         if(cnt[i]==temp) {
	            if(temp2!=0 && temp2==sortedarr[i]) continue;
	            System.out.print(sortedarr[i]+" ");
	            temp2=sortedarr[i];
	         }
	      }
	   }
	   
	   // �߰���
	   public double getMedian(int[] sortedarr) {

	      double median=0;
	      int length = sortedarr.length;
	      
	      // �迭�� ���̰� Ȧ���϶��� �߰���, ¦���϶� �߰� �� ������ ��� ���ϱ�
	      if(length%2 == 0) median = (sortedarr[length/2-1]+sortedarr[length/2])/(double)2;
	      else median = sortedarr[length/2];
	      
	      return median;
	   }

	   // ����
	   public int[] getRank(int[] arr) {
	      int[] rank = new int [arr.length];
	      // �迭�� 1�� �ʱ�ȭ
	   
	      
	      for(int i=0; i<arr.length; i++) {
	         for(int j=0; j<arr.length; j++) {
	            if(j==i)continue;
	            if(arr[i]<arr[j]) rank[i]++;
	         }
	      }
	      return rank;
	   }
	   
	   public void getInput() {
	      int n=0;
	      System.out.println("�迭 �����");
	      do {
	      System.out.println("�迭 ũ�� �Է�:");
	      n = scanner.nextInt();
	      if(n>20) System.out.println("�迭�� �ִ� ũ��� 100�Դϴ�. �ٽ� �Է��Ͻʽÿ�.");
	      }while(n>20);
	      
	      
	      int []arr=new int [n];
	      
	      
	      for(int i=0; i<n; i++) {
	         arr[i] = (int) (Math.random() * 20)+1;;
	         // �ߺ� �� ����
	         /*
	         for(int j=0; j<i; j++) {
	            if(arr[i]==arr[j])
	               i--;
	         }
	         */         
	      }

	      System.out.println("�ٻ簪 �� ���� �Է�:");
	      int comp = scanner.nextInt();
	      

	      int max = getMax(arr);
	      int min = getMin(arr);
	      int closest = getClosest(comp, arr);
	      double average = getAverage(arr);
	      int overAvg = overAverage(arr, average);
	      int []sortedarr = sorting(arr);
	      double median = getMedian(sortedarr);
	      int[] rank = getRank(arr);
	      
	      System.out.println("");
	      disp(arr, max, min, comp, closest, average, overAvg, sortedarr, median, rank);
	      
	      getMode(sortedarr);

	   }
	   
	   public void disp(int[] arr, int max, int min, int comp, int closest, double average, int overAvg, int[] sortedarr, double median, int[] rank) {
	      
	      System.out.print("�Էµ� �迭: ");
	      for(int i:arr)
	         System.out.print(i+" ");
	      System.out.println();
	      System.out.println("�ִ� ����: " + max);
	      System.out.println("�ּ� ����: " + min);
	      System.out.println(comp+"�� �ٻ� ����: " + closest);
	      System.out.println("��� ����: " + average);
	      System.out.println("��� �̻� ����: " + overAvg);
	      System.out.print("�迭 ���� ���� ���: ");
	      for(int j:sortedarr)
	         System.out.print(j+" ");
	      System.out.println();
	      System.out.println("�߰���: " + median);
	      System.out.print("��ũ ����: ");
	      for(int k:rank)
	         System.out.print(k+" ");
	      System.out.println();
	   }

	   public static void main(String[] args) {
	      All a = new All();
	      a.getInput();
	   
	   }
	}
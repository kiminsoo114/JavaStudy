package beyual.test1;

import java.util.Scanner;

public class All {
   
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
	      
	      for(int i=0; i<arr.length; i++)
	         if(arr[i]<min) min=arr[i];

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


	   // 버블정렬
	   public int[] sorting(int[] arr) {
	      // 배열 복사
	      int[] sortedarr = arr.clone();
	      int temp = 0;
	      for(int i=0; i<sortedarr.length-1; i++) {
	         for(int j=0; j<sortedarr.length-1;  j++) {
	            // 현 숫자가 다음 숫자보다 크면 스왑
	            if(sortedarr[j]>sortedarr[j+1]) {
	               temp = sortedarr[j];
	               sortedarr[j] = sortedarr[j+1];
	               sortedarr[j+1]= temp;
	            }
	         }
	      }
	      return sortedarr;
	   }
	   
	   // 최빈값
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

	      System.out.print("최빈값: ");
	      int temp2=0;
	      for(int i=0; i<cnt.length; i++) {
	         if(cnt[i]==temp) {
	            if(temp2!=0 && temp2==sortedarr[i]) continue;
	            System.out.print(sortedarr[i]+" ");
	            temp2=sortedarr[i];
	         }
	      }
	   }
	   
	   // 중간값
	   public double getMedian(int[] sortedarr) {

	      double median=0;
	      int length = sortedarr.length;
	      
	      // 배열의 길이가 홀수일때는 중간값, 짝수일때 중간 두 숫자의 평균 구하기
	      if(length%2 == 0) median = (sortedarr[length/2-1]+sortedarr[length/2])/(double)2;
	      else median = sortedarr[length/2];
	      
	      return median;
	   }

	   // 석차
	   public int[] getRank(int[] arr) {
	      int[] rank = new int [arr.length];
	      // 배열을 1로 초기화
	   
	      
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
	      System.out.println("배열 만들기");
	      do {
	      System.out.println("배열 크기 입력:");
	      n = scanner.nextInt();
	      if(n>20) System.out.println("배열의 최대 크기는 100입니다. 다시 입력하십시오.");
	      }while(n>20);
	      
	      
	      int []arr=new int [n];
	      
	      
	      for(int i=0; i<n; i++) {
	         arr[i] = (int) (Math.random() * 20)+1;;
	         // 중복 값 제거
	         /*
	         for(int j=0; j<i; j++) {
	            if(arr[i]==arr[j])
	               i--;
	         }
	         */         
	      }

	      System.out.println("근사값 비교 숫자 입력:");
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
	      
	      System.out.print("입력된 배열: ");
	      for(int i:arr)
	         System.out.print(i+" ");
	      System.out.println();
	      System.out.println("최대 값은: " + max);
	      System.out.println("최소 값은: " + min);
	      System.out.println(comp+"의 근사 값은: " + closest);
	      System.out.println("평균 값은: " + average);
	      System.out.println("평균 이상 개수: " + overAvg);
	      System.out.print("배열 버블 정렬 결과: ");
	      for(int j:sortedarr)
	         System.out.print(j+" ");
	      System.out.println();
	      System.out.println("중간값: " + median);
	      System.out.print("랭크 순서: ");
	      for(int k:rank)
	         System.out.print(k+" ");
	      System.out.println();
	   }

	   public static void main(String[] args) {
	      All a = new All();
	      a.getInput();
	   
	   }
	}
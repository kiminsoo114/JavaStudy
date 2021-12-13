package sist.com.array;

import java.util.Random;

//SelectionSort(선택정렬),InsertionSort,BubbleSort,QuickSort
public class Test8 {
   int []m=new int[10];
   public void initArray() {
      Random random=new Random();
      for (int i = 0; i < m.length; i++) {
         m[i]=random.nextInt(100);
      }
      
   }
   public void swap(int i,int j) {
      int imsi=0;
      imsi=m[i];
      m[i]=m[j];
      m[j]=imsi;
   }
   public void swapBubble(int j) {
         int temp=0;
         temp=m[j+1];
         m[j+1]=m[j];
         m[j]=temp;
   }
   
   
   
   public void bubbleSort(char state) {
      
      for (int i = 0; i < m.length-1; i++) {
         for (int j = 0; j < m.length-(i+1); j++) {
            if(state=='d') {
            if(m[j] <m[j+1]) {
                 swapBubble(j);      
             }
            }else if(state=='a') {
               if(m[j] >m[j+1]) {
                  swapBubble(j);                
                }
            }
         }
      }
      
   }
   public void selectionSort(int order) {
      
      for(int i=0;i<m.length-1;i++) {
         for(int j=i+1;j<m.length;j++) {
            if(order==0) {
            if(m[i]<m[j]) {
               swap(i,j);
             }
            }else {
               if(m[i]>m[j]) {
                  swap(i,j);   
                }
            }
         }
      }
   }
   public void sortDataDisp() {
      for(int i:m) {
         System.out.printf("%3d",i);
      }
      System.out.println();
   }
   public static void main(String[] args) {      
      Test8 a=new Test8();
      a.initArray();
      a.bubbleSort('d');
      //a.selectionSort(0);
      a.sortDataDisp();
   }
   

}




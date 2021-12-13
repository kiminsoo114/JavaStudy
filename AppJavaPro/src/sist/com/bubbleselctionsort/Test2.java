package sist.com.bubbleselctionsort;

import java.util.Iterator;

//isEmpty,isFull,add,search,modify,delete,printArray
public class Test2 {
	 int index;
	   int []m=new int [5];//[][][][][]
	   public boolean isEmpty() {
	      return index==0;
	   }
	   public boolean isFull() {
	      return index==m.length;
	   }
	   public void increment() {
	      int []imsi=new int[m.length*2];//[][][][][][][][][][]
	      for (int i = 0; i < m.length; i++) {
	         imsi[i]=m[i];
	      }
	      m=imsi;
	      //System.out.println(Arrays.toString(imsi));
	      
	      
	   }
	   public void add(int data) {
	      if(isFull()) {
	         increment();         
	      }
	      m[index++]=data;
	   }   
	   public void add(int fdata,int sdata) {
	      add(fdata);
	      add(sdata);
	      
	   }   
	   public void printArray() {
	      for (int i = 0; i <index; i++) {
	         System.out.printf("%5d",m[i]);
	      }
	      System.out.println();
	   }

   public static void main(String[] args) {
	   Test2 a=new Test2();
      a.add(10);
      a.add(20,30);
      a.add(40,50);
      a.add(60,70);
      a.add(80,90);
      a.add(100);
      a.add(110,120);
      a.printArray();
   }

}

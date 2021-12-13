package sist.com.array;

import java.util.Arrays;

//isEmpty,isFull,add,search,modify,delete,printArray
public class arrayEx10 {
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
      System.out.println(Arrays.toString(imsi));      
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
   public int search(int data) {//where,what
      for (int i = 0; i < m.length; i++) {
          if(m[i]==data)return i;
      }
      return -1;
      
   }
   public int search(int data,int fromIndex) {//where,what
      for (int i = fromIndex; i < m.length; i++) {
          if(m[i]==data)return i;
      }
      return -1;
      
   }
   public void modify(int origin,int change,int fromIndex,char state) {//where(Point),(origin,change)ValueCahange
      int index=search(origin,fromIndex);
      if(index==-1)return;
      m[index]=change;
      if(state=='a')modify(origin,change,fromIndex,state);
      
   }
   public void printArray() {
      for (int i = 0; i <index; i++) {
         System.out.printf("%5d",m[i]);
      }
      System.out.println();
   }
   //95   25   45   27   45

   public static void main(String[] args) {
	   arrayEx10 a=new arrayEx10();
      a.add(45);   
      a.add(25);   
      a.add(45);   
      a.add(27);   
      a.add(45);   
      a.printArray();
      a.modify(45, 450,0,'b');
      a.printArray();
   }

}











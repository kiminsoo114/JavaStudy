package sist.com.doublearray;

import java.util.Arrays;
import java.util.Random;

public class first1 {
   
   public void arrayEx1() {
      int [][]m=new int[2][3];//[][][]
                              //[][][]      
      Random rm=new Random();
      for (int i = 0; i < m.length; i++) {//За
         for (int j = 0; j < m[i].length; j++) {//ї­ 
            m[i][j]=rm.nextInt(10);            
         }         
      }      
      disp3(m);
   }
   public void disp1(int [][]m) {
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[i].length; j++) {
            System.out.printf("%5d",m[i][j]);
         }
         System.out.println();
      }
      System.out.println();
   }
   public void disp2(int [][]m) {
      for(int []i:m) {
         for(int j:i) {
            System.out.printf("%5d",j);
         }
         System.out.println();
      }
   }
   public void disp3(int [][]m) {
      for(int []i:m) {
         System.out.println(Arrays.toString(i));         
      }      
   }   
   public void arrayEx2(){
//	   int []a= {10,20,30,40,50};
//	   for(int i:a) {
//		   System.out.println(i);
	   int [][]b= {{10,20,30},{40,50,60}};
	   }
   
   public static void main(String[] args) {
      first1 a=new first1();
      //a.arrayEx1();
      a.arrayEx2();
   } 

}

package sist.com.controller;
//��� + �迭 
//�б⹮,�ݺ��� 

import java.util.Iterator;
import java.util.Scanner;

public class ControllerEx7 {
   Scanner scanner=new Scanner(System.in);
   public void controllerEx1() {
   //for,while,doWhile
   /*
    * System.out.println("Cnt:"); int cnt=scanner.nextInt(); for (int i = 0; i <
    * cnt; i++) { System.out.println("�μ�¯"+(i+1)); }
    */
     int row=0,col=0;
     System.out.println("Row:");
     row=scanner.nextInt();
     System.out.println("Col:");
     col=scanner.nextInt();
     for(int i=0;i<row;i++) {
        for(int j=0;j<col;j++) {
           System.out.print('*');
        }
        System.out.println();
     }      
      
   }
   public void showInteger() {
      System.out.println("1.��� 2.����");
      if(scanner.nextInt()==1) {
      for(int i=1;i<=100;i++) {
         if(i%7==0)System.out.println();
         System.out.printf("%3d",i);
        }
      }else {
         for(int i=0;i>=-100;i--) {
            if(i%7==0)System.out.println();
            System.out.printf("%3d",i);
           }
         }
      System.out.println();
   }
   
   

   public void showAlphabet() {
      int cnt=0;
      for(int i='a';i<='z';i++) {
         if(cnt%8==0)System.out.println();
         System.out.printf("%3c",i);
         cnt++;
      }
      System.out.println();
   }
   public void controllerEx2() {
      while(true) {
      System.out.println("1.������� 2.���ĺ���� 3.������");
      switch(scanner.nextInt()) {
      case 1:
         showInteger();break;
      case 2:
         showAlphabet();break;
      case 3:
         return;
      }
     }
      
      
   }   

   public static void main(String[] args) {
      ControllerEx7 c=new ControllerEx7();
      c.controllerEx2();
   }

}













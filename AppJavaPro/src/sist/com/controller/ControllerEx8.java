package sist.com.controller;

import java.util.Scanner;

public class ControllerEx8 {
   Scanner scanner=new Scanner (System.in);
   public void controllerEx1() {
      String name=null;
      int age=0;
      String addr=null;
      String state=null;
      while(true) {
         do {
              System.out.println("Name:");      
              name=scanner.next();
            }while(!(name.length()>=2&& name.length()<=6));
         do {
            System.out.println("Age:");      
            age=scanner.nextInt();
         }while(!(age>=20&& age<=100));
         do {
         System.out.println("����ҰŴ�?yes/no");
         state=scanner.next();
         }while(!(state.equals("yes")||state.equals("no")));
         if(state.equals("no"))break;
      }
      System.out.println(name+" "+age);      
   }   
   public static void main(String[] args) {
      ControllerEx8 c=new ControllerEx8();
      c.controllerEx1();
   }

}



package sist.com.controller;

//LOOPING
public class ControllerEx3 {
   public void loopingEx1() {
      int i=0;
      for(;i<5;i++) 
      System.out.println("Àº¿µ¾È³ç!");      
      System.out.println(i);      
      
   }
   public void loopingEx2() {
       int sum=0,even=0,odd=0;
      
       for(int i=1;i<=100;i++) {
          if(i%2==0)even+=i;
          else {
             odd+=i;
          }
          sum+=i;
       }
       System.out.println(sum+ " "+even+" "+odd);
      
   }   
   public static void main(String[] args) {
      ControllerEx3 c=new ControllerEx3();
      c.loopingEx2();
      
   }

}
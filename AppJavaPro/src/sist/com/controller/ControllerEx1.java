package sist.com.controller;

public class ControllerEx1 {
   
   public void controllerEx1() {
      int x=1,y=2,z=3;
      //System.out.println(x++==1);
      
        if(x++==1) { System.out.println("if x++==1 1");
        System.out.println("if x++==1 2"); } else {
        System.out.println("else x++==1 1"); } System.out.println("else x++==1 2" );
       
      System.out.println(x++==1&& ++x==3);
      
      /*
       * if(++x==2&& x++==3||++x==4) { System.out.println("True"); }else {
       * System.out.println("False"); }
       */
      
      if(++x==2) {
         if(y--==2) {
            if(++z==4) {
               
            }else {
               
            }
         }else {
            
         }
      }else {
         
      }
      if(++x==2&& y--==2&& ++z==4) {
         
      }else {
         
      }
      
      
      
   }
   
   public static void main(String[] args) {
      ControllerEx1 c=new ControllerEx1();
      c.controllerEx1();
   }

}
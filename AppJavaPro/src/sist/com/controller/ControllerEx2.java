package sist.com.controller;

//if,if else,if elseif elseif else,switch case default
//looping   for,while,do~while  (break,return)
public class ControllerEx2 {
   //if ~ else if 차이점 
   public void controlEx1(double avg) {
      if(avg>=90)System.out.println("A");
      else if(avg>=80)System.out.println("B");
      else if(avg>=70)System.out.println("C");      
   }   
   public void controlEx2(int value) {
      switch(value) {
      case 5:
         System.out.println("5");
         break;
      case 6:
      case 7:
      case 8:
         System.out.println("6");
         break;
      default:
         System.out.println("기타");
            
      }
      
   }   
   public void controlEx3(int first,int second) {//1 10  2  ,1 10 , 1 10 2
      switch(first) {
      case 1:
         System.out.println("1");
         default:
        	 System.out.println("other");
         switch(second) {
         case 10:
            System.out.println("10");
            return;
         case 20:
            System.out.println("20");
         }
         break;
      case 2:
         System.out.println("2");
      
      }
      
   }
   public static void main(String[] args) {
      ControllerEx2 c=new ControllerEx2();
      c.controlEx3(5,20);
      
   }

}

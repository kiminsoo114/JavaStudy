package sist.com.basic4.obj;

public class Father extends GrandFather{
   private int Father;
   
   public Father() {
      super();
   }
   
   public void work() {
      System.out.println("work");
   }
   public void sleep() {
//      sleep();   //선조Grand Father의 sleep까지 불러냄
      System.out.println("Father Sleep");
   }
}
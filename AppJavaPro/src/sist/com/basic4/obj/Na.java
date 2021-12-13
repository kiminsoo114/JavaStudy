package sist.com.basic4.obj;

public class Na extends Father{
   
   private int naValue;
   public Na() {
//      super(); //이게 생략되어있다.
   }
   
   public void game() {
      System.out.println("game");
   }
   public void sleep() {
      super.sleep();      //선조 Father의 sleep까지 불러냄
      System.out.println("Na Sleep");
   }   
   
}
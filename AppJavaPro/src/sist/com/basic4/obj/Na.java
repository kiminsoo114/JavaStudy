package sist.com.basic4.obj;

public class Na extends Father{
   
   private int naValue;
   public Na() {
//      super(); //�̰� �����Ǿ��ִ�.
   }
   
   public void game() {
      System.out.println("game");
   }
   public void sleep() {
      super.sleep();      //���� Father�� sleep���� �ҷ���
      System.out.println("Na Sleep");
   }   
   
}
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
//      sleep();   //����Grand Father�� sleep���� �ҷ���
      System.out.println("Father Sleep");
   }
}
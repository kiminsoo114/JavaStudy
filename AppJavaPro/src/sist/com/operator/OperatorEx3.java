package sist.com.operator;

public class OperatorEx3 {
   public int unaryOperator(int x,int y,int z,int k,int q) {
      
      return ++x + --y + z++ + --q; // 2 + 1 + 3 + 4
   }   
   public void unaryOperator(int data) {
      //System.out.println(!(data==5));
      System.out.println(~data);
   }
   //�ֿ켱,����,��� +,-, *,/,% 
   public int calcOperator(int x,int y,int z,int k) {
      return (x+y*z/k)%10;
   }
   public String calcOperator(int x) {
      //return x%2==0?"Even":"Odd";
      return x%2!=0?"Ȧ":"¦";
   }
   public void calcOper(int x) {
      if(x!=0&&x%3==0) {
         System.out.println("3�ǹ�� ");
      }
      else if(x!=0&&x%5==0) {
         System.out.println("5�ǹ�� ");
      }
      else if(x!=0&&x%7==0) {
         System.out.println("7�ǹ�� ");
      }else {
         System.out.println("��Ÿ ���...");
      }
   }
   public static void main(String[] args) {
      OperatorEx3 o=new OperatorEx3();
      //o.calcOper(25);
      //o.calcOper(10);
      //o.unaryOperator(-11);
      System.out.println(o.calcOperator(1,2,3,4));//9
      
   }

}











/*
 * package sist.com.variable.basic;
 * 
 * public class VariableEx2 {
 * 
 * 
 * public void methodAction1() { methodAction2();
 * System.out.println("methodAction1"); }
 * 
 * 
 * public void methodAction2() { System.out.println("methodAction2"); }
 * 
 * 
 * 
 * public static void main(String[] args) { VariableEx2 v= new VariableEx2();
 * v.methodAction1(); } }
 */
//Ŭ������ ���赵�̱⵵ ������ ����� ���� �ڷ��̱⵵ �ϴ�.
//�޸𸮸� stack�̶�� �Ѵ�.
//}�� ������ �������� �Ҹ� ������ ���ư���
//;�̰��� ������ �ǹ��ϹǷ� �ӹ��� ���ϸ� �� �޼ҵ�� �������.
package sist.com.variable.basic;

public class VariableEx2 {   
   public void methodAction1() {
      methodAction2();
      System.out.println("methodAction1");
   }   
   public void methodAction2() {
      methodAction3();
      System.out.println("methodAction2");
      
   }                       
   public void methodAction3() {   
      methodAction4();
      System.out.println("methodAction3");
      
   }                       
   public void methodAction4() {   
      System.out.println("methodAction4");
      return;
   }         
                                              
                                              // methodAction4
   public static void main(String[] args) {   //main
      VariableEx2 v= new VariableEx2();
      v.methodAction1();
   }
   
   

}
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
//클래스는 설계도이기도 하지만 사용자 정의 자료이기도 하다.
//메모리를 stack이라고 한다.
//}를 만나면 리턴으로 불린 값으로 돌아간다
//;이것은 종결을 의미하므로 임무를 다하면 그 메소드는 사라진다.
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
package sist.com.basic.obj;

public class Alphabet {
   
   public static void main(String[] args) {
       // B b=new B(20,new A(10));
        //b.getA().getA();
       C c=new C(30,new B(20,new A(50)));
       D d=new D(50,new C(30,new B(10,new A(20))));
       System.out.println(c.getB().getA().getA());
       System.out.println(d.getC().getB().getA().getA());
   }

}
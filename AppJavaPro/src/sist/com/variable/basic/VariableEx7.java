package sist.com.variable.basic;
//������ DATA�� ��°��� 

public class VariableEx7 {
   //�ڷ��� ����;   instance���� Heap
   public void methodEx1(int x,int y,int z) {//int x,int y,int z Paramter ,���� (�Ű�����),��������
      //�������� auto����  Stack
      //int x; ���� �������� �����̸� �Ҵ� �Ұ�
      x=x+1;
      y=y+1;
      z=z+1;
      System.out.println("x="+x+" y="+y+" z="+z);//10 20  30
      
   }   
   public int method2(byte x,byte y) {
      byte rs=(byte)(x+y);
      System.out.println("rs="+rs);
      return rs+rs;
   }
   public void method3(double x) {
      int h=20;
      double d=h;
      //h=d;
   }
   public double method4(int x,int y) {
      return  x<y?x+y:x*y;
   }
   public static void main(String[] args) {
      VariableEx7 v=new VariableEx7();
       System.out.println(v.method4(7,5));
      //v.method3(10);
      
      //short s=(short)v.method2((byte)10,(byte)20);
      //v.methodEx1(1,2,3);//1,2,3 Arguments(��������)
      /*
       * int x=10,y=20,z=30; v.methodEx1(x,y,z);
       */
      
      
   }

}


//double �� �Ǽ����̱⿡ 
//�������ڸ� ������ ������ �Ǽ����� �ְ� 
	












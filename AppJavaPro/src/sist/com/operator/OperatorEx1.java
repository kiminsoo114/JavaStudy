package sist.com.operator;
//�޸�(����) ������(����), ������
//�޼ҵ�(����,������,���)
//�ֿ켱  ()<-�켱������ ����ɶ� ���� ��.[]�迭����. , '.'(�ּҸ�ũ)  �̰͵��� ��켱
public class OperatorEx1 {
	public int firstOperator(int x,int y,int z) {      
	      //return x>y? (x+y*z):((x+y)*z);
	      return x>y?(x+y*z):y<z?((x-y)*z):((x+y)*z);
	   }
	   /*
	    * public boolean firstOperator(int x,int y,int z,int k) { return x>y?x==z:y<k;
	    * }
	    */
	   //���� ���� �ٳ���
	   public int firstOperator(int x,int y,int z,int k) {
	      //return x>y&& z>k?x+y*z:(x+y)*z;
	      return x>y|| z>k?x+y*z:(x+y)*z;
	   }
	   
	   public static void main(String[] args) {
	      OperatorEx1 o=new OperatorEx1();//HEAP
	      System.out.println(o.firstOperator(1, 2, 3, 4));//
	      /*
	       * int rs=o.firstOperator(5,6,7);//5,6,7 argumets
	       * System.out.printf("firstOperator Result=%d",rs);
	       */
	      
	      
	      

	}

}

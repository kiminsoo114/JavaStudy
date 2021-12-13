package sist.com.operator;
//메모리(공간) 연산자(도구), 제어자
//메소드(변수,연산자,제어문)
//최우선  ()<-우선순위가 변경될때 쓰는 것.[]배열선언. , '.'(주소링크)  이것들이 취우선
public class OperatorEx1 {
	public int firstOperator(int x,int y,int z) {      
	      //return x>y? (x+y*z):((x+y)*z);
	      return x>y?(x+y*z):y<z?((x-y)*z):((x+y)*z);
	   }
	   /*
	    * public boolean firstOperator(int x,int y,int z,int k) { return x>y?x==z:y<k;
	    * }
	    */
	   //포도 딸기 바나나
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

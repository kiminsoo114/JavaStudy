package sist.com.basic2.obj;

public class ObjectEx5 {

	public void add(int x, long y) {
		System.out.println("add(int x, long y)");//만약 이 메소드가 없으면 10,10을 해도 자동형변환이 일어나서 에러가 안나지만 
		//존재함으로 정확히 명시해주어야한다.
	}
	public void add(long x, int y) {
		System.out.println("add(long x, int y)");
	}
//	public void add(int x, int y){
//		System.out.println("add(int x, int y)");
//		
//	}
//	public void add(long x, long y) {
//		System.out.println("add(long x, long y)");
//	}
	  public void makerOverLoad1() {
	      byte b=20;
	      short s=25;
	      int i=100;
	      System.out.print(i);
	      System.out.print(5>3);
	      System.out.println(new char[]{'a','b','c'});
	      System.out.println(10.5F);
	      System.out.println("abc");      
	   }
	   public void array(int ...x) {
	      System.out.println("array(int ...x)");
	   }
	   public void array(long ...x) {
	      System.out.println("array(long ...x)");
	   }   
	   public void array(double ...x) {
	      System.out.println("array(double ...x)");
	   }
	   

	
	   public static void main(String[] args) {
		      ObjectEx5 o=new ObjectEx5();
		      o.array(new int [] {10,20,30,40});
		      //o.makerOverLoad1();
		      //o.add(10, 10L);
		   }

		}


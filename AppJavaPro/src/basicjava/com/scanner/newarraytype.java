package basicjava.com.scanner;

public class newarraytype {
	   public int[] test1() {
		      int[] m = new int[] {0,1};
		      return m;
		   }

		   public int[] test2() {
		      int[] a = {0,1};
		      return a;
		   }
		   
		   public int[] test3() {
		      return new int[] {0,1};
		   }
		 
//		   public int[] test4() {
//		      return {0,1};
//		   }
		   
		   public static void main(String[] args) {

		      newarraytype d=new newarraytype();
		      System.out.print(d.test1()[0]+" "+d.test1()[1]);
		      System.out.println();
		      System.out.print(d.test2()[0]+" "+d.test2()[1]);
		      System.out.println();
		      System.out.print(d.test3()[0]+" "+d.test3()[1]);
		   }

	

}


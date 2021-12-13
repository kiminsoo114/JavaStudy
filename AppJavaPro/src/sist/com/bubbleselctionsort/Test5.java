
package sist.com.bubbleselctionsort;

public class Test5 {
	   int m[] = {50, 40, 30, 20, 10};
	   public void selectionSort(int order) {
	      int sort=0;
	      for(int i=0;i<m.length-1;i++) {
	         for (int j = i+1; j < m.length; j++) {
	            if(order == 0) {
	               if(m[i]>m[j]) {
	                  sort = m[i];
	                  m[i] = m[j];
	                  m[j] = sort;}
	         }else if(order == 1){
	               if(m[i]<m[j]) {
	                  sort = m[i];
	                  m[i] = m[j];
	                  m[j] = sort;}
	         }
	            for(int k:m) {
	               System.out.printf("%3d",k);
	            }
	            System.out.println();
	         }
	      }
	   }
	   public static void main(String[] args) {
		   Test5 t=new Test5();
		   t.selectionSort(0);
	}
}


package sist.com.doublearray;

import java.lang.reflect.Array;

public class first3 {

	public void disp(int [][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.printf("%5d",m[i][j]);
			}
			System.out.println();
		}
		
	}
	

		
	public void sum(int [][]m) {
	      final int ROW=m.length;
	      final int COL=m[0].length;
	      for (int i = 0; i < ROW-1; i++) {
	         for (int j = 0; j < COL-1; j++) {
	            m[i][COL-1]+=m[i][j];
	            //m[ROW-1][i]+=m[j][i];
	            m[ROW-1][j]+=m[i][j];   
	            
	         }   
	         m[ROW-1][COL-1]+=m[i][i];
	      }
	      
	      
	      
	   }   
//		      int i = 0;
//		      int j = 0;
//		      int lastTotal = 0;
//		      
//		      for (i = 0; i < arr.length-1; i++) {
//		         int colTotal = 0;
//		         int rowTotal = 0;
//
//		         for (j = 0; j < arr[i].length-1; j++) {
//		            if (i == j) {
//		               lastTotal += arr[i][j];
//		               arr[arr.length-1][arr.length-1] = lastTotal;
//		            }
//		            rowTotal += arr[i][j];
//		            colTotal += arr[j][i];
//		         }
//		         arr[i][j] = rowTotal;
//		         arr[j][i] = colTotal;
//		      }
//		     System.out.printf("%d",arr[i][j]);
//		   }
	
		
				
	public static void main(String[] args) {
		first3 a=new first3();
		int [][]m={{10,20,30,0},{40,50,60,0},{70,80,90,0},{0,0,0,0}};
		a.disp(m);
		 System.out.println();
		a.sum(m);
		a.disp(m);
		
	
	
		}
	}


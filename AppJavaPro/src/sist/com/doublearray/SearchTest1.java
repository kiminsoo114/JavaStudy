package sist.com.doublearray;

import java.util.Arrays;

public class SearchTest1 {
	int [][]m= {{10,20,30},{40,50,60},{70,80,90}};

	
	public int []search(int data){
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(m[i][j]==data)
				return new int[] {i,j};
			}//for
		}//for
		return null;
	}
	public int []search(int data,int row, int col){
		for (int i = row; i < m.length; i++) {
			for (int j = col; j < m[i].length; j++) {
				System.out.println("row="+i+" col="+j+"="+m[i][j]);
				if(m[i][j]==data)
				return new int[] {i,j};
			}//for
		}//for
		return null;
	}
	public static void main(String[] args) {
		SearchTest1 d=new SearchTest1();
		System.out.println(Arrays.toString(d.search(90,0,1)));
	}
}

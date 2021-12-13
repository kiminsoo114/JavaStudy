package sist.com.doublearray;

import java.util.Arrays;

public class ArrayTest1 {
	int[][]m= {{1,2,3,4},{5,6,7,8}};
	
	public void increment() {
	}
	
	
	public void incre1() {
		int [][]imsi=new int[m.length+2][m[0].length];
	System.arraycopy(m, 0, imsi, 0, m.length);
	m=imsi;
		for(int []i:imsi) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	
	
	public static void main(String[] args) {
		ArrayTest1 a=new ArrayTest1();
		a.incre1();
	}
}

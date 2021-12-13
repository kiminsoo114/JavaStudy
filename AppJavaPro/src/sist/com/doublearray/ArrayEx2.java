package sist.com.doublearray;

import java.util.Arrays;

//isEmpty,isFull
public class ArrayEx2 {
   int [][]m=new int[2][3];
   int row=0,col=-1;
   public boolean isEmpty() {
      return row==0&& col==-1;
   }
   public boolean isFull() {
      return row==m.length-1 && col==m[0].length-1;
   }
   public void increment() {
      int [][]imsi=new int[m.length+2][m[0].length];//2행 3열에서--->4행 3열로
      System.arraycopy(m, 0, imsi, 0, m.length);
      m=imsi;
   }
   
   public int []search(int data){
	   for (int i = 0; i < m.length; i++) {
		for (int j = 0; j < m[i].length; j++) {
			if(m[i][j]==data)return new int [] {i,j};
			}
		}
	   return null;
	}
   public int []search(int data,int row,int col){
	      for(int i=row;i<m.length;i++) {
	         for (int j = col>(m[i].length-1)?0:col; j < m.length; j++) {
	            if(m[i][j]==data)return new int[] {i,j};
	         }
	      }
	      return null;
	   }

   
   public void add(int data) {
      if(isFull())increment();
      if(col<m[0].length-1) {
         col++;
      }else {
         col=0;
         row++;
      }
      m[row][col]=data;
   }
   public void disp() {
      for(int []i:m) {
         System.out.println(Arrays.toString(i));
      }
      System.out.println();
   }
   public void modify(int origin,int change,int row,int col,int state) {
	      int []rs=search(origin,row,col);
	      if(rs==null)return;
	      m[rs[0]][rs[1]]=change;
	      if(state=='a')modify(origin, change, row, col, state);
	   }
   public void delete(int data) {
	   int []rs=search(data);
	   if(rs==null)return;
	   for (int i = rs[0]; i < m.length; i++) {
		for (int j = rs[1]; j < m[i].length; j++) {
			if(i==m.length-1&&j==m[i].length-1) {//행의 끝이면서 열끝인지를 판단하는 코드.
				m[i][j]=0;
				break;
			}
			if(j==m[i].length-1) {//열끝
				m[i][j]=m[i+1][0];
				rs[1]=0;
			}else {
				m[i][j]=m[i][j+1];
			}
		}
	}
	   if(col==0) {
		   row--;
		   col=m[0].length-1;
	   }else
		   col--;
   }
   
   public static void main(String[] args) {
	   ArrayEx2 a=new ArrayEx2();
      a.add(10);
      a.add(20);
      a.add(30);
      a.add(40);
      a.add(30);
      a.add(60);
      a.disp();
      a.delete(30);
      a.add(99);
      a.add(70);
      a.add(80);
      a.delete(20);
     // a.delete(20);
      //a.modify(20, 200, 0, 0, 'a');
      a.disp();
   }

}

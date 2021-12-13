package sist.com.doublearray;

public class ArrayEx1 {
	final int ROW=4;	
	final int COL=3;
	int [][]aa=new int[ROW][COL];//4행 3열	
	int [][]bb=new int[COL][ROW];//3행 4열	
	
	public void init(int [][]data) {
		int cnt=0;
		for (int i = 0; i < data.length; i++) {//i<data.length 행의 길이가 몇개인데 0부터 몇개이상으로 가기전까지 증감해줘라.
			for (int j = 0; j < data[i].length; j++) {//j<data[i].length i번째 행에서 열의 길이가 몇개인데 0부터 그 몇개이상으로 가기전 까지 증감해줘라.
				data[i][j]=++cnt;
			}
			
		}
		
		
	}
	
	
	public void disp(int [][]data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.printf("%5d",data[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	   
	   public void change(int [][]aa,int [][]bb) {
	      int h=0,y=0;
	      for (int i = 0; i < bb.length; i++) {
	         for (int j = 0; j < bb[i].length; j++) {
	            /*
	             * bb[0][0]=aa[0][0]; bb[0][1]=aa[0][1]; bb[0][2]=aa[0][2]; bb[0][3]=aa[0][3];
	             */
	            bb[i][j]=aa[h][y];
	            if(y<aa[i].length-1) {
	            	//인덱스의 값은 길이보다 항상 -1만큼 짧기 때문이다.
	            	//길이가 5이면 인덱스는 4까지 있다.
	               y++;
	            }else {
	               y=0;
	               h++;
	            }
	             
	         }
	      }
	   }

	
	public static void main(String[] args) {
		ArrayEx1 a=new ArrayEx1();//a=new는 클래스와 메소드 사이에 있는 곳으로 접근가능
		//ROW|COL|aa|bb에 접근 가능하다.
		a.init(a.aa);
		a.change(a.aa, a.bb);
		a.disp(a.aa);
		a.disp(a.bb);
		
	}
}

package sist.com.doublearray;

public class ArrayEx1 {
	final int ROW=4;	
	final int COL=3;
	int [][]aa=new int[ROW][COL];//4�� 3��	
	int [][]bb=new int[COL][ROW];//3�� 4��	
	
	public void init(int [][]data) {
		int cnt=0;
		for (int i = 0; i < data.length; i++) {//i<data.length ���� ���̰� ��ε� 0���� ��̻����� ���������� ���������.
			for (int j = 0; j < data[i].length; j++) {//j<data[i].length i��° �࿡�� ���� ���̰� ��ε� 0���� �� ��̻����� ������ ���� ���������.
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
	            	//�ε����� ���� ���̺��� �׻� -1��ŭ ª�� �����̴�.
	            	//���̰� 5�̸� �ε����� 4���� �ִ�.
	               y++;
	            }else {
	               y=0;
	               h++;
	            }
	             
	         }
	      }
	   }

	
	public static void main(String[] args) {
		ArrayEx1 a=new ArrayEx1();//a=new�� Ŭ������ �޼ҵ� ���̿� �ִ� ������ ���ٰ���
		//ROW|COL|aa|bb�� ���� �����ϴ�.
		a.init(a.aa);
		a.change(a.aa, a.bb);
		a.disp(a.aa);
		a.disp(a.bb);
		
	}
}

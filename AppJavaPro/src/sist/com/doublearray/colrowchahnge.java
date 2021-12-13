package sist.com.doublearray;

public class colrowchahnge {

	public void disp(int [][]m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.printf("%-5d",m[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		colrowchahnge a=new colrowchahnge();
		int [][]m= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		a.disp(m);
	}
}

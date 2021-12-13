package sist.com.bubbleselctionsort;

public class InsertionSort1 {
	int m[]	= {30,40,85,65,2};
	int imsi=m.length;
	public void insertionSort() {
		for (int i = 1; i < m.length; i++) {
			for (int j = i-1; j < m.length-1; j++) {
				if(m[j]>m[j+1]) {
					int imsi=m[j+1];
					m[j+1]=m[j];
					m[j]=imsi;
				}
				
							
				}
				 for(int k:m) {
		               System.out.printf("%3d",k);
		            }
		            System.out.println();
			}
	
			
		}
		
	
	
	
	public static void main(String[] args) {
		InsertionSort1 a=new InsertionSort1();
		a.insertionSort();
	}
}

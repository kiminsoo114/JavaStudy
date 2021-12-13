package beyual.test1;

public class Test2 {
	int []m= {30,58,64,2,8};
	
	public void swap(int i,int j) {
		int imsi=0;
		imsi=m[i];
		m[i]=m[j];
		m[j]=imsi;
	}
	
	
	
	
	public void selection(int order) {
	      
	      for(int i=0;i<m.length-1;i++) {
	         for(int j=i+1;j<m.length;j++) {
	            if(order==0) {
	            if(m[i]<m[j]) {
	               swap(i,j);
	             }
	            }else {
	               if(m[i]>m[j]) {
	                  swap(i,j);   
	                }
	            }
	         
	         for(int k:m) {
	        	 System.out.printf("%3d",k);
	         }
	         System.out.println();
	         }
	      }
	   }
	
		
	
	
	
	
	public static void main(String[] args) {
		Test2 a=new Test2();
		int []m= {30,58,64,2,8};
		a.selection(022);
		
	}
}

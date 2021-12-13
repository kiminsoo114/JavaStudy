package sist.com.core.array;

//석차,중복검사
//1차원 
public class ArrayEx6 {
	int []m=new int[5];//인스턴스변수
	int []rank=new int[m.length];
	//클래스안에 있으면 인스턴스 변수
	public void initArray() {
		for (int i = 0; i < m.length; i++) {
			m[i]=(int)(Math.random()*100);
		}
	}
	
	
	
	public void rank() {
		//여기있으면 지역변수
		for (int i = 0; i < m.length; i++) {
			rank[i]=1;
			for (int j = 0; j < m.length; j++) {
				if(m[i]<m[j]) {
					rank[i]++;
				}
			}
		}
		disp(m);
		disp(rank);
	
	}
	public void disp(int []m) {
		for(int i:m) {
			System.out.printf("%5d",i); 
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayEx6 a=new ArrayEx6();
		a.initArray();
		a.rank();
		
	}
}

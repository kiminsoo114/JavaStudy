package sist.com.core.array;

//����,�ߺ��˻�
//1���� 
public class ArrayEx6 {
	int []m=new int[5];//�ν��Ͻ�����
	int []rank=new int[m.length];
	//Ŭ�����ȿ� ������ �ν��Ͻ� ����
	public void initArray() {
		for (int i = 0; i < m.length; i++) {
			m[i]=(int)(Math.random()*100);
		}
	}
	
	
	
	public void rank() {
		//���������� ��������
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

package sist.com.test;

public class Test6 {
public static void main(String[] args) {
	 int num=12345,sum=0;
	
	//10���� ������ ������ �ϸ� ������ �ڸ��� ��´�.
	
	/*
	 * for(num=12345;num>0;num=num/10) { System.out.println(num%10); sum+=num%10; }
	 * System.out.println("�� �ڸ����� ��"+sum);
	 */
	 
	 while(num>0) {
		 sum+=num%10;
		 System.out.println("sum="+sum+",num%10="+num%10);
		 num=num/10;
	 }
	 System.out.println("�� �ڸ����� ��"+sum);
}
}

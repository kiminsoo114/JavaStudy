package basicjava.chapter4;

public class FlowEx13 {
	public static void main(String[] args) {
		int sum=0; //합계를 저장하기 위한 변수. 초기화를 해준것.
		
		for(int i =1; i<=10;i++) {
			sum+=i; //sum=sum+i;
		System.out.printf("1부터 %2d 까지의 합: %2d%n",i,sum);
	}
}
}

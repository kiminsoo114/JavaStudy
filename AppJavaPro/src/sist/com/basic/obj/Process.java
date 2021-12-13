package sist.com.basic.obj;

public class Process {
	private int countProcess=10;  //이것을 명시적 초기화라고 한다.
	private String processWhere="Front";//ㄴexplicit 
	private String processWhen="MethodBefore";


	public Process() {
		
	}
	public Process(int countProcess) {
		this.countProcess=countProcess;
	}
	public void setCountProcess(int countProcess) {
		this.countProcess = countProcess;
	}
	public int getCountProcess() {
		return this.countProcess;
	}
	
public static void main(String[] args) {
	Process p1=new Process(500);
	p1.setCountProcess(900);
	p1.setCountProcess(9000);
	System.out.println(p1.countProcess);
	System.out.println(p1.processWhere);
	System.out.println(p1.processWhen);
}
//우선순위는 클래스 - 생성자 - 전달인자이다.
}

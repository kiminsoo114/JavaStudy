package sist.com.basic.obj;

public class Process {
	private int countProcess=10;  //�̰��� ����� �ʱ�ȭ��� �Ѵ�.
	private String processWhere="Front";//��explicit 
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
//�켱������ Ŭ���� - ������ - ���������̴�.
}

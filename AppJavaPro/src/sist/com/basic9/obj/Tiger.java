package sist.com.basic9.obj;

public class Tiger implements RunnableEx,Scare{

	@Override
	public void run() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("TigerRun");
	}

	@Override
	public void sharpClaw() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("TigerAttack");
	}
	
}

package sist.com.basic9.obj;

public class Rabbit implements RunnableEx,Pet {

	@Override
	public void run() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("RabbitRun");
	}

	@Override
	public void love() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("RabbitCute");
	}
}

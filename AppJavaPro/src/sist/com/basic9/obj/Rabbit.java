package sist.com.basic9.obj;

public class Rabbit implements RunnableEx,Pet {

	@Override
	public void run() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("RabbitRun");
	}

	@Override
	public void love() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("RabbitCute");
	}
}

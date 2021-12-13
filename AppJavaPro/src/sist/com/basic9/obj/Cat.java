package sist.com.basic9.obj;

public  class Cat implements RunnableEx, ThinkAbility,Pet{

	@Override
	public void run() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("CatRun");
	}

	@Override
	public void think() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("CatThink");
	}

	@Override
	public void love() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("CatCute");
		
	}
	
	
	
}

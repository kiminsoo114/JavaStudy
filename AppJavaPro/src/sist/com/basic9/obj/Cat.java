package sist.com.basic9.obj;

public  class Cat implements RunnableEx, ThinkAbility,Pet{

	@Override
	public void run() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("CatRun");
	}

	@Override
	public void think() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("CatThink");
	}

	@Override
	public void love() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("CatCute");
		
	}
	
	
	
}

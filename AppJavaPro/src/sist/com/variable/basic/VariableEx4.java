package sist.com.variable.basic;
//메소드는 첫단어는 다 소문자. 뒤의 단어의 앞에 부분은 대문자.
public class VariableEx4{
	int a=5;
	public void localValueEx1() {
		a=a+1;
		System.out.println("a="+a);
	}
	int x=5;
	public void localValueEx2() {
		localValueEx1();
	x=x+5;
	System.out.println("x="+x);
	}
	
	public static void main(String[] args) {
		VariableEx4 v=new VariableEx4();
		v.localValueEx2();
		v.localValueEx2();
		v.localValueEx2();
	}
	
}

/*
 * package sist.com.variable.basic;
 * 
 * public class VariableEx4 { public void localValueEx1() { int a=5; a=a+1;
 * System.out.println(a);
 * 
 * } int x=5; public void localValueEx2() { x=x+5; System.out.println("x="+x); }
 * public void localValueEx3() { int a=10; { int b=50; { int c=99; c=100; }
 * b=88; } a=55;
 * 
 * }
 * 
 * public static void main(String[] args) { VariableEx4 v=new VariableEx4();
 * v.localValueEx3(); //v.localValueEx2();//10 //v.localValueEx2();//15
 * //v.localValueEx2();//20 }
 * 
 * }
 */







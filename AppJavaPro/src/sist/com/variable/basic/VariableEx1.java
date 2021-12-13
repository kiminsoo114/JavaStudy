package sist.com.variable.basic;

//클래스 (설계도, 사용자정의 자료형)
//ctrl_F11
//변수 데이터를 담는 공간(변하는 값)
//DATA-1.기본형 2.참조형
//BYTE
public class VariableEx1 {


	public int variableEX2() {
		double dValue=25.6789;
		return (int)dValue;
		
		
	}

public char variableEX3() {
	return 97;
}
	public int variableEX4() {
		return 'A';
	}
	
	
	
public static void main(String[] args) {
	VariableEx1 v=new VariableEx1();
	int rs=v.variableEX2()+v.variableEX2();
	System.out.println(v.variableEX4());
}
}
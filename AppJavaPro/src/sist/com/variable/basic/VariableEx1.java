package sist.com.variable.basic;

//Ŭ���� (���赵, ��������� �ڷ���)
//ctrl_F11
//���� �����͸� ��� ����(���ϴ� ��)
//DATA-1.�⺻�� 2.������
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
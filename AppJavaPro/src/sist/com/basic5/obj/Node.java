package sist.com.basic5.obj;

public class Node {
	static Node node;//=null;�����ʾƵ� null��
	private  int dataValue;
	
	
	public void setDataValue(int dataValue) {
		this.dataValue=dataValue;
	}
	
	public int getDataValue() {
		return this.dataValue;
	}
	public static Node getInstance() {
	if(node==null) {
		node=new Node();
	}
	return node;
	}
	/*
	 * if(node==null) { node=new Node(); } return node;//static �޼ҵ忡���� �ν��Ͻ� ������ �����
	 * �����⿡ node�� ������ ����. }
	 */
	private Node() {
		dataValue=0;//���� Ŭ�����̱� ������ Node�� private���� ������ �����ϴ�.
	}
	public static void main(String[] args) {//���������� static������. �ν��Ͻ������� new�� �ؾ��� �������������.
		
		
	}
}

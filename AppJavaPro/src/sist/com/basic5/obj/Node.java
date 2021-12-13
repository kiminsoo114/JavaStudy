package sist.com.basic5.obj;

public class Node {
	static Node node;//=null;쓰지않아도 null임
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
	 * if(node==null) { node=new Node(); } return node;//static 메소드에서는 인스턴스 변수를 사용할
	 * 수없기에 node가 에러가 난다. }
	 */
	private Node() {
		dataValue=0;//같은 클래스이기 때문에 Node가 private여도 접근이 가능하다.
	}
	public static void main(String[] args) {//메인이지만 static영역임. 인스턴스변수는 new를 해야지 집어넣을수있음.
		
		
	}
}

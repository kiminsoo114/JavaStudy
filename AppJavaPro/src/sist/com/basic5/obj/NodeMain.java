package sist.com.basic5.obj;

public class NodeMain {

	public static void main(String[] args) {
		//new Node(); //Node클래스에 private을 하면 생성불가.
		Node.getInstance().setDataValue(50);
		System.out.println(Node.getInstance().getDataValue());
	}
}

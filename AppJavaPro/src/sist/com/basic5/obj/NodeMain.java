package sist.com.basic5.obj;

public class NodeMain {

	public static void main(String[] args) {
		//new Node(); //NodeŬ������ private�� �ϸ� �����Ұ�.
		Node.getInstance().setDataValue(50);
		System.out.println(Node.getInstance().getDataValue());
	}
}

package sist.com.basic3.obj;

//Inheritance(���) ��ü�� ���������� ����(����,����) ���輳��
//���ϻ��
//is a, has a ���踦 �����ϸ� ��. 
//is a�ϰ� ���õ� Ű����� extends�̴�.(Ȯ��.����)
//extends(����,Ȯ��), super(����), child(�ڼ�)
public class ObjectProcess extends Object{
	
	public ObjectProcess() {
		//this//this = ObjectProcess�̴�.
	//System.out.println(this.equals(new ObjectProcess());
		//Object o=new ObjectProcess(); ����
		//ObjectProcess o=new Object(); �Ұ���
	}
	public void objectAction() {
		//System.out.println(this.equals(new ObjectProcess()));
		System.out.println(this.equals(this));
		System.out.println(this.hashCode());
		System.out.println(new ObjectProcess().hashCode());
		System.out.println(getClass());
	}
	public static void main(String[] args) {
		//new ObjectProcess().objectAction();
		ObjectProcess o=new ObjectProcess();
		o.objectAction();
		//System.out.println(o.toString);
		
	}
}

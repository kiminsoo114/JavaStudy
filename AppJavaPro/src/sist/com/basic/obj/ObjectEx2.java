package sist.com.basic.obj;

public class ObjectEx2 {
	int data;//��������� �ʱⰪ���� �������ִ�. int�� ���� 0�̴�.
	static int staticValue; //staticValue�� �ʱⰪ�� 0���� �Ǿ��ִ�.//����ƽ ���� ���� ���δ� Ŭ���� ������� �Ѵ�.
	//static ������ �ϳ��� Ŭ�������� ��� ��ü���� �����ϴ� �����̴�.
	final int GAB = 500;//���ܺ���
	public void method() {
		int value=0;
		value++;
		data++;
		staticValue++;
		System.out.println("value="+value+"data="+data+"staticValue="+staticValue);
		//int value;//���������� stack�� �ö󰣴�.
		//value++;//int value;�ؿ� value++;�� �ϸ� int value=0;ó�� �ʱⰪ�� ���༭ ������ ���°��̴�. ���������� �ʱⰪ�� �������־���Ѵ�.
		//���������� ȣ���ϸ� �׶����� ���۵Ǵ°Ű� �ٽ� �ʱ�ȭ�ȴ�.
	}
											//println	
	public static void main(String[] args) {//main ->���� ���� println�ö󰡴°�.
									   //stack�޸� ����
		ObjectEx2 o1 =new ObjectEx2();	
		ObjectEx2 o2 =new ObjectEx2();
		ObjectEx2 o3 =new ObjectEx2();
		System.out.println("HelloMain");
	//data=90; int data�տ� static�� �Ⱥ��̸� data�� �ȵ��� ������ new data�� ���༭ ������ �ȸµ�� ��� �����̴�.
	new ObjectEx2().data=90;//data(90)�� �־���.
	System.out.println(new ObjectEx2().data);//������� 0�� �����µ� new�� ���°��� �Ź� HEAP���ٰ� ���ο� ���� ������ ����� �������� println�� �ִ� new ObjectEx2().�� println�� new ObjectEx2()�� ������ �ٸ� ���̴�.
	o1.method(); //value=1 data=1
	o1.method(); //value=1 data=1
	o1.method();
	o2.method();
	o2.method();
	o3.method();
	o1.data=500;
	ObjectEx2.staticValue=50;
	//o1.GAB=99;//�������� ������ final�� ���̻� �ٲ����ʴ´� �߱� �����̴�.
	}
}

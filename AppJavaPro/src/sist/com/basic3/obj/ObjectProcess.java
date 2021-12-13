package sist.com.basic3.obj;

//Inheritance(상속) 개체를 유기적으로 연결(협업,조립) 관계설정
//단일상속
//is a, has a 관계를 이해하면 끝. 
//is a하고 관련된 키워드는 extends이다.(확장.연장)
//extends(연장,확장), super(선조), child(자손)
public class ObjectProcess extends Object{
	
	public ObjectProcess() {
		//this//this = ObjectProcess이다.
	//System.out.println(this.equals(new ObjectProcess());
		//Object o=new ObjectProcess(); 가능
		//ObjectProcess o=new Object(); 불가능
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

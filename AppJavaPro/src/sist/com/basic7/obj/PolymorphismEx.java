package sist.com.basic7.obj;

public class PolymorphismEx {

	public void classCastAction(Object obj) {
		//Object o = new StringAction();
		if(obj instanceof StringAction) {
		((StringAction)obj).stringAction();
	}
//	public void classCastAction(StringAction n) {
//		
//	}
//	
	if (obj instanceof NumberAction) {
		NumberAction new_name = (NumberAction)obj;
		new_name.numberAction();
	}
	
	}
	
	public static void main(String[] args) {
		PolymorphismEx e=new PolymorphismEx();
		e.classCastAction(new NumberAction());
	}
			
}

package sist.com.basic2.obj;
//String,StringBufffer,StringBuilder
public class ObjectEx7 {   
   public void objectPro1() {
      
      String s1=new String(new byte[] {97,98,99,100});//value[97,98,99,100]
      String s2=new String("Ajax");//value[A,j,a,x]
      
      
      /*
       * for(byte b:s1.getBytes()) { System.out.println(b); }
       */
      char []c=new char[10];//[][][][][][][][][][]
      s2.getChars(0, 2, c, 0);
      System.out.println(c);
      
   }
   public void objectPro2() {
	   String s1="abc";//�Ͻ���(������)���� ���. �̰� �迭��.
	   String s2=new String("defd");//�̰��� �����(FM)
	   s1.concat("�Դϴ�");//�̰� �ǹ� ��ü�� s1�� .�ڿ� �����°ɷ� �ض� ��� �ǹ��̴�.
	   System.out.println(s1.concat("�Դϴ�"));
	   System.out.println(s1.charAt(0));
	   System.out.println(s1.codePointAt(0));//a�� int��(�ƽ�Ű) ��ȯ.
	   System.out.println(s1.codePointBefore(1));//�������� int������ ȣ��
	   System.out.println(s2.indexOf("d",s2.indexOf("d")+1));
	   System.out.println(s1.startsWith("bc"));//�����ϴ� ������ ������ true �ƴϸ� false
	   System.out.println(s1.endsWith("cb"));
	   
   }
   public void objectPro3() {
	   String s1="Abc# Def# GHI";
	   String []strArray=s1.split(" ");
	   for(String s:strArray) {
		   System.out.println(s);//sl.split("")���⿡ �����°��� �������̵ȴ�.
	   }
   }
   public static void main(String[] args) {
      ObjectEx7 o=new ObjectEx7();
      o.objectPro3();
   }

}
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
	   String s1="abc";//암시적(묵시적)으로 허용. 이거 배열임.
	   String s2=new String("defd");//이것이 명시적(FM)
	   s1.concat("입니다");//이거 의미 자체가 s1을 .뒤에 나오는걸로 해라 라는 의미이다.
	   System.out.println(s1.concat("입니다"));
	   System.out.println(s1.charAt(0));
	   System.out.println(s1.codePointAt(0));//a를 int값(아스키) 변환.
	   System.out.println(s1.codePointBefore(1));//이전값을 int값으로 호출
	   System.out.println(s2.indexOf("d",s2.indexOf("d")+1));
	   System.out.println(s1.startsWith("bc"));//시작하는 내용이 옳으면 true 아니면 false
	   System.out.println(s1.endsWith("cb"));
	   
   }
   public void objectPro3() {
	   String s1="Abc# Def# GHI";
	   String []strArray=s1.split(" ");
	   for(String s:strArray) {
		   System.out.println(s);//sl.split("")여기에 들어오는것이 기준점이된다.
	   }
   }
   public static void main(String[] args) {
      ObjectEx7 o=new ObjectEx7();
      o.objectPro3();
   }

}
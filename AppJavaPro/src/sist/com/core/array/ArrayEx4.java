package sist.com.core.array;
//upper,lower,intiCap ¿¹Á¦¹®



//upper,lower,initCap,reverse,substring,startWith
public class ArrayEx4 {
	
		   public void loopString(char []imsi,char[]c,int state) {
		      for(int i=0;i<imsi.length;i++) {
		         imsi[i]=state==0?( (c[i]>='a'&& c[i]<='z')?(char)(c[i]-32):c[i]):(c[i]>='A'&& c[i]<='Z')?(char)(c[i]+32):c[i];
		      }
		   }
		   public char[]upper(char[]c){
		      char []imsi=new char[c.length];
		      loopString(imsi,c,0);
		      return imsi;
		   }
		   public char[]lower(char[]c){
		      char []imsi=new char[c.length];      
		         loopString(imsi, c, 1);      
		      return imsi;
		   }
		   public char[]initCap(char[]c){
		      char []rs=lower(c);
		      rs[0]=(char)(rs[0]-32);
		      return rs;
		   }
	
//	public char[] upper(char []c) {
//		char []imsi=new char [c.length];
//		for (int i = 0; i < imsi.length; i++) {
//			imsi[i]=(c[i]>='a'&&c[i]<='z')?(char)(c[i]-32):c[i];
//			
//		}
//		return imsi;
//	}
//	public char[] lower(char []c) {
//		char []imsi=new char [c.length];
//		for (int i = 0; i < imsi.length; i++) {
//			imsi[i]=(c[i]>='A'&&c[i]<='Z')?(char)(c[i]+32):c[i];
//		}
//		return imsi;
//	}
	
	
	
	
	public static void main(String[] args) {
		char []c = {'a','j','A','x','D','a','t','A'};
		ArrayEx4 a=new ArrayEx4();
	
		System.out.println(	a.initCap(c));
	}

}

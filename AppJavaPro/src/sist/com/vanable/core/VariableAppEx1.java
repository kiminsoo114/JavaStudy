package sist.com.vanable.core;
//변수(기본형,형변환)Method param,return,operator,controller
//byte~ double,char,boolean,String
public class VariableAppEx1 {
   
	 public void byteMethod1() {
	      //byte byteValue1=(10+20)>Byte.MAX_VALUE?Byte.MAX_VALUE:(10+20);
	        byte byteValue1=(Byte.MAX_VALUE+1)>Byte.MAX_VALUE?Byte.MAX_VALUE:0;//지역변수
	        System.out.println(byteValue1);
	       System.out.println(Byte.MAX_VALUE);
	 }
	
	
	
	
	
	
	
public static void main(String[] args) {
	VariableAppEx1 v=new VariableAppEx1();
	v.byteMethod1();
   }
}
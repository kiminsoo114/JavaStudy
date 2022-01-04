package com.sist.lib;
// indexOf 
// lastIndexOf 
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Hello Java!!";
        //        01234567891011
        int i=s.indexOf('a');//indexOf()=> 시작지점을 지정하지 않으면 0부터 시작해서 찾고자하는 것의 숫자를 반환
        System.out.println("i="+i);
        int j=s.lastIndexOf('a');
        System.out.println("j="+j);
        
        s="c:\\javaDev\\java.basic\\Hello.java";
        String ss=s.substring(s.lastIndexOf(".")+1);
        System.out.println(ss);
        
        		
	}

}
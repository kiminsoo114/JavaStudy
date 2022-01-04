package com.sist.lib;
/*
 *   replace(char c1,char c2)
 *           old       new
 *   replace(String s1,String s2)
 *           old         new 
 *   replaceAll(String regex,String s)
 *               old           new  ==> 정규식 
 *           
 *   문자의 형식
 *   211.238.142.181
 *   127.0.0.1
 *   211.63.64.10
 *   211.238.142.1 
 *   
 *   [0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}
 *   
 *   맛있는 맛있고 맛있게 맛있고....
 *   맛있+(*)
 *   
 *   영화는 영화 영화가 ...
 *   영화*(+(X))
 */
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Hello Java!!";
        String s1=s.replace('a', 'b');
        System.out.println(s1);
        String s2=s.replace("ll", "LL");
        System.out.println(s2);
        String data="AAABBBcccddd안녕하세요1234567890 자바입니다";
        String ss=data.replaceAll("[A-Za-z0-9]", "");
        System.out.println(ss);
        String ss1=data.replaceAll("[^A-Z]", "");
        // [A-Z] => 알파벳 대문자 전체 
        // [^A-Z] => 대문자를 제외하고 
        System.out.println(ss1);
        String ss2=data.replaceAll("[^a-z]", "");
        // 소문자 => a-z
        System.out.println(ss2);
        String ss3=data.replaceAll("[^0-9]", "");
        // 숫자 => 0-9
        System.out.println(ss3);
        String ss4=data.replaceAll("[^가-하]", "");
        // 한글 => 가-  
        // ^부정 (제외하고)
        // [^] 부정  
        // ^[가-R] ==> 시작  (한글로 시작한 모든 문자)
        // [0-9]$ ==> 끝 (숫자로 끝나는 모든 것)
        // ^[가|나] ==> (가) 나 (나) 글자로 시작하는 모든 문자열 
        // * (0번이상)
        // + (1번이상)
        // ^,$,|,+,* ==> 사용되는 기호 ==> * , +   ==> 실제문자 \\+
        System.out.println(ss4);
        
	}

}


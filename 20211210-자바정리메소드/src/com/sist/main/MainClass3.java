package com.sist.main;

/*
 * �޼ҵ� ���
 * ===���� + ������ + ���
 *  ������ : ����(++,--), ���, ��, ��
 *  	==============��ġ / ��ġ
 *  				++a     a++
 *  
 *  int a = 10;
 *  int b = ++a + a++ + a++ + ++a  
 *           11    11    12    14   ===>48
 *           
 *  int a = 10;
 *  int b = ++a + ++a + ++a + ++a       
 * 
 * int a =10;
 * int b = ++a; �����ϰ� ����
 * 
 * int b = a++; �����ϰ� ����
 * 
 * 
*/
public class MainClass3 {
	public static void main(String[] args) {
		 int a = 10;
		 int b = ++a + ++a + ++a + ++a;
		 
		 int c = 10;
		 int d = ++c + c++ + c++ + ++c; 
		 
		 System.out.println(b);
		 System.out.println(d);
	}
}

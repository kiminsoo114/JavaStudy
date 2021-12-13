package sist.com.controller;
import java.util.Calendar;

// ���� ,��, ����
public class ControllerEx9 {
   public int getAge(int year) {
      System.out.println();
      return Calendar.getInstance().get(Calendar.YEAR)-year+1;
   }
   public String getDdi(int year) {
	      String []str={"������","��","��","����","��","��","ȣ����","�䳢","��","��","��","��"};
	      return str[year%12];
	      
	   }   
   
   public boolean isYunDal(int year) {
      return year%4==0&& year%100!=0||year%400==0;
   }
   public int getCount(int year,int month,int day) {
      int cnt=0;
      cnt=(year-1)*365;//
      for(int i=1;i<year;i++) {
         if(isYunDal(i))cnt++;
      }
      for(int i=1;i<month;i++) {
         switch (i) {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:            
            cnt+=31;
            break;
         case 2:
            if(isYunDal(year))cnt+=29;
            else
               cnt+=28;
            break;
         default:
            cnt+=30;         
         }
      }
      cnt+=day;
      return cnt;      
   }
   public String getWeek(int year,int month,int day) {
     String str[]={"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
    return str[year%7];
   
   
   }
   public void input(int year,int month,int day) {   
      int age=getAge(year);
      String ddi=getDdi(year);
      String week=getWeek(year, month, day);
      disp(year,age,ddi,week);
   }
   public void disp(int year,int age,String ddi,String week) {
      System.out.println(year+"�⵵�� �¾�� �� "+age+"��");
      System.out.println(year+"�⵵�� �¾�� �� "+ddi+"���Դϴ�");
      System.out.println(year+"�⵵�� �¾�� �� "+week+"�� �¾");
      
      
   }   
   public static void main(String[] args) {      
      ControllerEx9 c=new ControllerEx9();
      c.input(2021,1,16);
   } 

}






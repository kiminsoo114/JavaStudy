package sist.com.basic2.obj;

import java.util.Calendar;

public class ObjectEx8 {   
   //�̸�,����,���û���,����,����,��,��ȭ��ȣ 
   String[]data={"�ּ���#951210-1010547#031)457-1280",
               "������#981203-1012947#02)457-1980",
               "������#990210-2010547#061)957-1280",
                 "���μ�#580510-1010547#02)657-9280"};
   Man []man=new Man[data.length];//[][][][]
   public void stringProcess() {
      for (int i = 0; i < data.length; i++) {
          String []res=data[i].split("#");
          man[i]=new Man();
          for(int j=0;j<res.length;j++) {
             switch (j) {
            case 0: 
                man[i].setName(res[j]);
                   break;
            case 1:
                man[i].setAge((Calendar.getInstance().get(Calendar.YEAR)-(Integer.parseInt(res[j].substring(0, 2))+1900))+1);               
                //System.out.println(res[j].substring(2, 6));
                String month=String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1);
                int number=Calendar.getInstance().get(Calendar.DATE);
                String day=String.valueOf(number>=1&& number<=9?"0".concat(String.valueOf(number)):String.valueOf(number));
                if(month.concat(day).equals(res[j].substring(2, 6))) {
                man[i].setBrith(true);   
                }                
               break; 
            case 2:
               //System.out.println(res[j].substring(0,res[j].indexOf(")")));
               String loc=res[j].substring(0,res[j].indexOf(")"));
               String temp;
               if(loc.equals("02")) {
                  temp="����";
               }else if(loc.equals("031"))
                  temp="���";
               else
                  temp="��Ÿ";
               man[i].setLocation(temp);
               break;
               
           }//switch
          }//for
       }//for
      disp();
   }
   public void disp() {
      for(Man m:man) {
         System.out.println(m.toString());
      }
   }
   
   public static void main(String[] args) {
      ObjectEx8 o=new ObjectEx8();
      o.stringProcess();
   }

   
}
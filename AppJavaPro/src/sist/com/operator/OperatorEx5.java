package sist.com.operator;

//4³â¸¶´Ù 
//ÃÖ´Ü»ê½¬°ü³í»ï´ëÄÞ 
public class OperatorEx5 {
   
   public boolean yunDal(int year) {
      return year%4==0&&year%100!=0||year%400==0;
   }
   public void logicOperator(int year) {
          System.out.println(yunDal(year)?"À±´Þ":"ºñÀ±´Þ");
   }   
   public void logicOperator(int x,int y,int z,int k) {
      /*
       * boolean state=++x==1&&--y==1 ||++z==4;
       * System.out.println("x="+x+" y="+y+" z="+z);// 224
       */
      /*
       * boolean state=x++==1&&--y==1 ||++z==4;// 2 2 4 // 2 2 4 // 2 1 3 ½Â // 2 1 4 ¿¬
       * System.out.println("x="+x+" y="+y+" z="+z);
       */
      /*
       * boolean state=++x==1(&&--y==1 ||++z==4);
       * System.out.println("x="+x+" y="+y+" z="+z);// 2 2 3
       */
      
      
        boolean state=++x==1&&(--y==1 ||++z==4)&&k++==4;
        System.out.println("x="+x+" y="+y+" z="+z+" k="+k);//2 2 3 5
                                                           //2 2 3 5
                                                           // 2 2 3 4 
       
   }
   public void samHang(int x,int y,int z,int k) {
      System.out.println(++x==--y?(++z<--k)?"A":"B":(x+y)<(z+k)?"C":"D");
   }
   
   public void injectionOpearator() {
      int x=5;
      /*
       * x+=+3; //x=x+1,x++ System.out.println(x);
       */
      /*
       * x+=5; x*=7; x/=2;//x=x/2
       */      
      x-=-500;
      System.out.println(x);
      
   }
   public void shiftOperator() { //1 0 1 0
      System.out.println(10<<2);  
      
      //0 0 0 0 1 0 1 0
      //0 0 0 1 0 1 0 0
      //0 0 1 0 1 0 0 0
   }
   public static void main(String[] args) {
      OperatorEx5 o=new OperatorEx5();
      o.injectionOpearator();
      //o.injectionOpearator();
      //o.samHang(1, 2, 3, 4);
      //o.logicOperator(1, 2, 3, 4);
      //o.logicOperator(400);
      
   } 

}








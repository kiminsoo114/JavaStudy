package sist.com.array;

public class ArrayEx2 {
   
   public void randomEx() {
      System.out.println((int)(Math.random()*100)%45);
      //System.out.println((int)(Math.random()*100)%45+1);
   }
   public void arrayAction1() {
      int []m=new int [10];//[int][][][][][][][][][]
      for(int i=0;i<m.length;i++) {
         m[i]=(int)((Math.random()*100));
      }
      disp(m);
   }   
   public void disp(int[] data) {
      for(int i=0;i<data.length;i++) {
         System.out.printf("%3d",data[i]);
      }
      System.out.println();
   }
   public int[] arrayAction2() {
      int []array= {95,27,64,100,90};//[95]....[90]
      return array;      
   }
   public String[] arrayAction3() {
      String []str={"Java","ReAct","Spring","Xml","Html"};//str[Java][ReAct][Spring][Xml][Html]
      //return str[(int)(Math.random()*10)%5];
      return str;
   }
   public static void main(String[] args) {
      ArrayEx2 a=new ArrayEx2();
      
      String []rs=a.arrayAction3();
      
      for(int i=0;i<rs.length;i++) {
         System.out.println(rs[i]);
      }
      /*
       * System.out.println(a.arrayAction2()[0]);
       * System.out.println(a.arrayAction2()[1]);
       * System.out.println(a.arrayAction2()[2]);
       * System.out.println(a.arrayAction2()[3]);
       * System.out.println(a.arrayAction2()[4]);
       */
      /*
       * for(int i=0;i<a.arrayAction2().length;i++) {
       * System.out.println(a.arrayAction2()[i]); }
       */
      
      
      
      //a.randomEx();
      //a.arrayAction1();
   }

}

















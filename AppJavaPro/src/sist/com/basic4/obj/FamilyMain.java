package sist.com.basic4.obj;


public class FamilyMain {
   
   
   public static void main(String[] args) {
//      GrandFather g;
//      Father f;
//      Na n = new Na();
      
      
//      GrandFather g = new Object();   //error      Object()
//      Object o = new GrandFather();
//      ((GrandFather)o).sleep();
      
//      Na na = new Na();
//      na.sleep();
//      na.game();
	   Father f=new Father();
	   //f.sleep();
	   
	   
       GrandFather gf=new Father();
       gf.sleep();
   }

}
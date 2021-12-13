package sist.com.basic5.obj;

public class HuManMain {
   
   public void process(int data) {
      HuMan h;
      if(data>=10) {
         h=new Student();   //Student(think, gotoSchool(),study() HuMan(think(),work(),listen())
      }else {
         h=new Doctor();      //Doctor(treat(), HuMan()think(),work(),listen(),think())
      }
      h.think();
   }
   
   public static void main(String[] args) {
      //Student( gotoSchool(),study(),   MuMan(think(),work(),listen())   )
      
//      Student s = new Student();
//      s.think();
      
//      HuMan h = new Doctor();
//      h.think();
//      h = new Student();
//      h.think();
      
      HuManMain h = new HuManMain();
      h.process(10);
   }
   
}
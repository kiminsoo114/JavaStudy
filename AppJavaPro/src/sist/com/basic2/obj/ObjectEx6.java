package sist.com.basic2.obj;

public class ObjectEx6 {//scope
   private  String value;
   private static  String maker="Oralce";
   
   public ObjectEx6(String value) {
      this.value=value;
      //this.maker="Sun";
   }
   
   public void setMaker(String maker) {
      ObjectEx6.maker=maker;
   }
   public static String getMaker() {
      return ObjectEx6.maker;
   }

   public String getValue() {
      return value;
   }

   public void setValue(String value) {
      this.value = value;
   }

   public static void main(String[] args) {
      ObjectEx6 o1=new ObjectEx6("A");//value(A)
      ObjectEx6 o2=new ObjectEx6("B");//value(Xml)
      o1.setMaker("Ms");
      System.out.println(o2.getMaker());

      
      
      
   }
}
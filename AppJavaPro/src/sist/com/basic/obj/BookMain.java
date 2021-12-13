package sist.com.basic.obj;

public class BookMain {
   /*
    *  book1=sist.com.basic.obj.Book@7de26db8
    *  book2=sist.com.basic.obj.Book@1175e2db
    */
   public static void main(String[] args) {
      Book book1=new Book();//bookName|author|publisher|price(0)|isbn
      //Book book2=new Book();//bookName|author|publisher|price(5000)|isbn
      
      book1.getInstance().setPrice(4500);
      System.out.println(book1.getInstance().getPrice());
      
//      System.out.println("book1="+book1);
//      System.out.println("book2="+book2);
//       book2.setPrice(5000);
//       System.out.println(book2.getPrice());
      
      
      
   }   

}

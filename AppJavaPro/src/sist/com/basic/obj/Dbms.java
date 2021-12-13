package sist.com.basic.obj;
//Constructor(������)
//����:instance���� �ʱ�ȭ 
public  class Dbms {
   private String url;
   private String account; //�̰͵��� �ν��Ͻ� ������ ������
   private String password;
   private int connectMax;
   private boolean isStart;
   
   public  Dbms() {      
	   this("");//ù�ٿ� �;��Ѵ�.
	  System.out.println("Dbms()");
   }
   public  Dbms(String url) {
    this(url,"");
    System.out.println("Dbms(String url)");
   }
   public  Dbms(String url,String account) {
	   this(url,account,"");
	   System.out.println("Dbms(Dbms(String url,String account)");
   }
   public  Dbms(String url,String account,String password) {
	   this(url,account,password,0);
	   System.out.println("Dbms(String url,String account,String password");
   }
   public  Dbms(String url,String account,String password,int connectMax) {
	   this(url,account,password,connectMax,false);
      System.out.println("Dbms(String url,String account,String password,int connectMax");
   }
   public  Dbms(String url,String account,String password,int connectMax,boolean isStart) {
      this.url=url;
      this.account=account;   
      this.password=password;
      this.connectMax=connectMax;
      this.isStart=isStart;
      System.out.println("Dbms(String url,String account,String password,int connectMax,boolean isStart");
   }
   public Dbms(Dbms db) {
      this.url=db.url;
      this.account=db.account;   
      this.password=db.password;
      this.connectMax=db.connectMax;
      this.isStart=db.isStart;
   }
   public void disp(Dbms this) {
      System.out.println("url:"+this.url+" account:"+this.account+" password:"+password+"  connectMax:"+connectMax+" isStart:"+isStart);
   } //���� ������ �ν��Ͻ�.
   public static void main(String[] args) {
//      Dbms db1=new Dbms();//url|account|password|connectMax
//      Dbms db2=new Dbms("localhost:1521");//url|account|password|connectMax
//      Dbms db3=new Dbms("localhost:1521","Java");//url|account|password|connectMax
//      Dbms db4=new Dbms(db3);
//      db1.disp();
//      db2.disp();
//      db3.disp();
//      db4.disp();
	   Dbms d=new Dbms();
   }
   

}









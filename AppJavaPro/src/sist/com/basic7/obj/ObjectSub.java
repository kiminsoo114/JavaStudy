package sist.com.basic7.obj;


public class ObjectSub extends Object {
	   private int objectSub;
	   public ObjectSub() {
	      super();
	   }
	   public ObjectSub(int objectSub) {
	      this.objectSub=objectSub;
	   }
	   @Override
	   public String toString() {
	      //return super.toString()+"ObjectSub [objectSub=" + objectSub + "]";
		   return "ObjectSub [objectSub=" + objectSub + "]";
	   }
	   
	   

	}
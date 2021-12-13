package sist.com.basic6.obj;
//(alt+shirt+s)+ o(»ý¼ºÀÚ),r(getter,setter)
public class ActionForWard {
	private String path;
	private boolean redirect;
	
	
	public ActionForWard() {
		super();
	}


	public ActionForWard(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public boolean isRedirect() {
		return redirect;
	}


	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}


	
	

}
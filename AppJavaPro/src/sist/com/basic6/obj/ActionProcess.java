package sist.com.basic6.obj;

import java.util.Scanner;

public class ActionProcess {
	Scanner scanner=new Scanner(System.in);
	public void print() {
		String cmd=null;
		while(true) {
			System.out.println("1.Login 2.DeleteList 3.Update 4.InfoAction 5.Exit");
			switch (scanner.nextInt()) {
			case 1: 
				cmd="login";break;
			case 2: 
				cmd="delete";break;
			case 3: 
				cmd="update";break;
			case 4: 
				cmd="info";break;
			default:
				return;
			}//switch
			//Action action=new ActionFactory().getAction(cmd);
			Action action=ActionFactory.getInstance().getAction(cmd);
			ActionForWard af= action.execute();
			if(af.isRedirect()) {
				System.out.println(af.getPath()+" 직접이동");
			}else {
				System.out.println(af.getPath()+" 간접이동");
			}
			
		}//while
		
	}
	public static void main(String[] args) {
		new ActionProcess().print();
	}

}

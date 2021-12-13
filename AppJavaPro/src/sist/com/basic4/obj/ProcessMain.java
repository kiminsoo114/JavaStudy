package sist.com.basic4.obj;

public class ProcessMain {
	private Process process;
	 	
	public ProcessMain(Process process) {
		super();
		this.process = process;
	}
	
	
		
 public static void main(String[] args) {
	ProcessMain p1=new ProcessMain(new ClientProcess());//client
	//process process =new ClinetProcess();
	ProcessMain p2=new ProcessMain(new AdminProcess());//admin
			p1.process.connect();
			p2.process.connect();
		}
		
		//		ClientProcess c=new ClientProcess();
//		c.connect();
	}

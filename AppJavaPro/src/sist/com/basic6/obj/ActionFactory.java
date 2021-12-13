package sist.com.basic6.obj;

public class ActionFactory {
	/*
	 * static final ActionFactory ACTION_FACTORY; static { ACTION_FACTORY=new
	 * ActionFactory(); } public static ActionFactory getInstance() { return
	 * ACTION_FACTORY; }
	 */
	private static ActionFactory actionFactory;
	
	public static ActionFactory getInstance() {
		if(actionFactory==null) {
			actionFactory=new ActionFactory();
		}
		return actionFactory;
		
	}
		
	public  Action getAction(String command) {
		if(command.equalsIgnoreCase("login")) {
			return new LoginAction(new OracleDao(), "loginView", true);
		}
		else if(command.equals("delete")) {
			return new DeleteAction(new MySqlDao(),"listView", false);
		}
		else if(command.equals("update")) {
			return new UpdateAction(new MySqlDao(),"upDateView", false);
		}
		else if(command.equals("info")) {
			return new InfoAction(new MsSqlDao(), "InfoView", true);
		}
		return null;
	}
	
	
}


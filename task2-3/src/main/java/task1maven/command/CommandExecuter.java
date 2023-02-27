package task1maven.command;

import java.lang.reflect.Method;
import java.util.List;

import task1maven.bag.Bag;
import task1maven.dao.CommandDao;
import task1maven.model.Command;
import task1maven.model.Customer;


public class CommandExecuter {

	
	public static Bag executer(String commandName,Bag bag)  {
		try {
			CommandDao commandDao = new CommandDao();
			Command command = commandDao.getCommand(commandName);
			
			

			Class<?> c = Class.forName("task1maven.operations." + command.getClassName());
		
			Object obj = c.newInstance();
			Method method;
			Bag dbBag;
			if (!bag.getMap().isEmpty()) {
				method = c.getDeclaredMethod(command.getMethodName(), Bag.class);
				dbBag = (Bag) method.invoke(obj, bag);

			} else {
				method = c.getDeclaredMethod(command.getMethodName());
				dbBag = (Bag) method.invoke(obj);
			}
			System.out.println("-> Execute works right");
			return dbBag;

		} catch (Exception e) {
			System.out.println("-> Executing failed");
			e.printStackTrace();
	
		}
		return null;		
	}
	
	
	private static boolean isValue(Command command) {
		if (command == null) {
			System.out.println("Command Couldn't Found");
			return false;
		}
		System.out.println("-> Command Information; \n\t" + 
		command.getCommandName() + "\n\t" + command.getClassName() + "\n\t" + command.getMethodName());
		return true;
	}
	
	

	}

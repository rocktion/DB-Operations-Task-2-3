package task1maven.dao;

import task1maven.model.Command;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class CommandDao {
	
	private static SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Command.class)
            .buildSessionFactory();
	
	public Command getCommand(String commandName) {

		try (Session session = sessionFactory.openSession()) {
			List<Command> commands =  session.createQuery("FROM Command", Command.class).list();
			
			for (Command commandItem : commands) {
				if(commandItem.getCommandName().equals(commandName)) {
					System.out.println("bu komut var");
					return commandItem;			
				}
			}
				
        }	
		System.out.println("bu komut yok");
		return null;
		
	}

}

package task1maven.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "command")
public class Command {
	
	@Id
	@Column(name = "command_name")
	private String commandName;

	@Column(name = "class_name")
	private String className;
	
	@Column(name = "method_name")
	private String methodName;

	public Command() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCommandName() {
		return commandName;
	}

	public String getClassName() {
		return className;
	}

	public String getMethodName() {
		return methodName;
	}
	
	


}

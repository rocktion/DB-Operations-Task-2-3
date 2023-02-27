package task1maven;

import task1maven.bag.Bag;
import task1maven.bag.BagKey;
import task1maven.command.CommandExecuter;
import task1maven.operations.CustomerOperations;

public class task3 {

	public static void main(String[] args) {
		
		
		CustomerOperations customerOperations = new CustomerOperations();
		
		
		
		Bag bagAdd = new Bag();
		bagAdd.put(BagKey.CNAME, "task3");
		bagAdd.put(BagKey.CSURNAME, "task3");
		bagAdd.put(BagKey.CTC, "1231234");
		bagAdd.put(BagKey.CEMAIL, "task3@task34.com");

		Bag customerBag = CommandExecuter.executer("add_customer_info", bagAdd);
		
		System.out.println(customerBag);
		System.out.println(customerBag.getMap());
		System.out.println("-------------------");
		System.out.println(bagAdd);
		System.out.println(bagAdd.getMap());

	}

}

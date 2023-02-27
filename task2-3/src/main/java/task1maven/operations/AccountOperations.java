package task1maven.operations;

import java.util.List;

import task1maven.model.Account;

public class AccountOperations {
	
	public void add(List<Account> accountList, Account account) {
		
		accountList.add(account);
	}
	
				

	public void update(List<Account> accountList, Account account, int index) {
		
		accountList.add(index, account); 
	}
	
	
	public void delete(List<Account> accountList, int index) {
		
		accountList.remove(index);
	}
	
}

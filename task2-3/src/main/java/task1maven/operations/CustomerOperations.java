package task1maven.operations;

import java.util.List;

import task1maven.bag.Bag;
import task1maven.bag.BagKey;
import task1maven.dao.CustomerDao;
import task1maven.model.Customer;

public class CustomerOperations {

	private CustomerDao customerDao;

	public CustomerOperations() {
		this.customerDao = new CustomerDao();
	}

	
	
	
	
	public Bag add(Bag bag) {
		String name = (String) bag.getValue(BagKey.CNAME);
		String surname = (String) bag.getValue(BagKey.CSURNAME);
		String tc = (String) bag.getValue(BagKey.CTC);
		String mail = (String) bag.getValue(BagKey.CEMAIL);

		Customer customer = new Customer(name, surname, tc, mail);
		Customer createdCustomer = customerDao.addCustomer(customer);
		
		Bag createdCustomerBag = new Bag();
		createdCustomerBag.put(BagKey.CID, createdCustomer.getId());
		createdCustomerBag.put(BagKey.CNAME, createdCustomer.getName());
		createdCustomerBag.put(BagKey.CSURNAME, createdCustomer.getSurname());
		createdCustomerBag.put(BagKey.CTC, createdCustomer.getTc());
		createdCustomerBag.put(BagKey.CEMAIL, createdCustomer.getEmail());
		
		return createdCustomerBag;
	}
	
				

	public void update(List<Customer> customerList, Customer customer, int index) {
		
		customerList.add(index, customer); 
	}
	
	
	public void delete(List<Customer> customerList, int index) {
		
		customerList.remove(index);
	}
	
}

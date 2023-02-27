package task1maven.operations;

import java.util.List;

import task1maven.model.Address;

public class AddressOperations {
	
public void add(List<Address> addressList, Address address) {
		
		addressList.add(address);
	}
	
				

	public void update(List<Address> addressList, Address address, int index) {
		
		addressList.add(index, address); 
	}
	
	
	public void delete(List<Address> addressList, int index) {
		
		addressList.remove(index);
	}

}

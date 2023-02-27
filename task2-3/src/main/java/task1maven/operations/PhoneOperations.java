package task1maven.operations;

import java.util.List;

import task1maven.model.Phone;

public class PhoneOperations {
	
public void add(List<Phone> phoneList, Phone phone) {
		
		phoneList.add(phone);
	}
	
				

	public void update(List<Phone> phoneList, Phone phone, int index) {
		
		phoneList.add(index, phone); 
	}
	
	
	public void delete(List<Phone> phoneList, int index) {
		
		phoneList.remove(index);
	}

}

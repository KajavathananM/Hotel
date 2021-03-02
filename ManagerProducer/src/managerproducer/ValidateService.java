package managerproducer;

import receptionproducer.NewCustomer;

public interface ValidateService {
	boolean verifyName(String name);
	boolean verifyEmail(String email);
	boolean verifyContactNo(String contactNo);
	boolean verifyAll(NewCustomer newCustomer);
	
}

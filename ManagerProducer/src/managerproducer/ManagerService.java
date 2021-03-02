package managerproducer;

import receptionproducer.BookedCustomer;
import receptionproducer.NewCustomer;

public interface ManagerService {
	void confirmBooking(NewCustomer newCustomer);
	void generateReceipt(BookedCustomer bookedCustomer);
	void calculateRoomPayment(BookedCustomer bookedCustomer);
}

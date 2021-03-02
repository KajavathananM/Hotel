package receptionproducer;

import java.text.ParseException;

public interface ReceptionService {
	void viewRooms();
	NewCustomer bookRoom() throws ParseException;
	
}

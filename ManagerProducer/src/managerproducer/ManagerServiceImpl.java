package managerproducer;

import receptionproducer.BookedCustomer;
import receptionproducer.NewCustomer;
import receptionproducer.Room;
import receptionproducer.RoomFactory;

public class ManagerServiceImpl implements ManagerService {
	RoomFactory roomFactory = new RoomFactory();

	@Override
	public void confirmBooking(NewCustomer newCustomer) {
		ValidateService validateService = new ValidateServiceImpl();
		if (validateService.verifyAll(newCustomer)) {
			System.out.println("Try again");

		} else {
			BookedCustomer bookedCustomer = new BookedCustomer(newCustomer);
			calculateRoomPayment(bookedCustomer);
			generateReceipt(bookedCustomer);
		}

	}

	@Override
	public void generateReceipt(BookedCustomer bookedCustomer) {
		// TODO Auto-generated method stub
		System.out.println("====Booking Receipt====");
		System.out.println("Name: " + bookedCustomer.getName());
		System.out.println("Room Type: " + bookedCustomer.getRoomType());
		System.out.println("Contact No: " + bookedCustomer.getContactNo());
		System.out.println("Email: " + bookedCustomer.getEmail());
		System.out.println("Number of Adults: " + bookedCustomer.getNoOfAdults());
		System.out.println("Number of Children: " + bookedCustomer.getNoOfChildren());
		System.out.println("Number of rooms: " + bookedCustomer.getNoOfRooms());
		System.out.println("Check in time: " + bookedCustomer.getCheckInTime());
		System.out.println("Check out time: " + bookedCustomer.getCheckOutTime());
		System.out.println("Payment: " + bookedCustomer.getRoomCost());
		System.out.println("=====================");
	}

	@Override
	public void calculateRoomPayment(BookedCustomer bookedCustomer) {
		int dateCheckIn = (int) bookedCustomer.getCheckInTime().getTime();
		int dateCheckOut = (int) bookedCustomer.getCheckOutTime().getTime();
		Room category = roomFactory.getRoom(bookedCustomer.getRoomType());

		int noOfDays = dateCheckOut - dateCheckIn;
		int noOfRooms = bookedCustomer.getNoOfRooms();
		int roomCost = (int) ((noOfRooms) * noOfDays * category.getCost() / (24 * 60 * 60 * 1000));

		bookedCustomer.setNoOfDays(noOfDays);
		bookedCustomer.setRoomCost(roomCost);
	}

}

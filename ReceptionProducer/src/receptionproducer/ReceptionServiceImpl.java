package receptionproducer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ReceptionServiceImpl implements ReceptionService{
	Scanner sc=new Scanner(System.in);
	NewCustomer newCustomer=new NewCustomer();
	@Override
	public void viewRooms() {
		RoomFactory roomFactory=new RoomFactory();
		ArrayList <Room> list=new ArrayList<Room>();
		list=roomFactory.getRooms();
		
		System.out.println("Room List");
		for(Room room:list) {
			room.printDetails();
		}
	}
	@Override
	public NewCustomer bookRoom() throws ParseException {
		System.out.print("Welcome to our Hotel"+"\n");
		
		System.out.print("Enter name: ");
		newCustomer.setName(sc.nextLine());
		
		System.out.print("Which type of Room you want to book?: " );
		newCustomer.setRoomType(sc.nextLine());
		
		System.out.print("Contact number: " );
		newCustomer.setContactNo(sc.nextLine());
		
		System.out.print("Email: " );
		newCustomer.setEmail(sc.nextLine());
		
		
		System.out.print("Number of Adults: " );
		newCustomer.setNoOfAdults(sc.nextInt());
		
		System.out.print("Number of Children: " );
		newCustomer.setNoOfChildren(sc.nextInt());
		
		System.out.print("Number of Rooms: " );
		newCustomer.setNoOfRooms(sc.nextInt());
		
		System.out.print("Enter Check in time: ");
		String checkIn=sc.next();  
	    Date checkInDate=new SimpleDateFormat("dd/MM/yyyy").parse(checkIn); 
		newCustomer.setCheckInTime(checkInDate);
		
		System.out.print("Enter Check out time: ");
		String checkOut=sc.next();
		sc.nextLine();
	    Date checkOutDate=new SimpleDateFormat("dd/MM/yyyy").parse(checkOut); 
		newCustomer.setCheckOutTime(checkOutDate);
		
		return newCustomer;
	}

	


	

	
	

	

}

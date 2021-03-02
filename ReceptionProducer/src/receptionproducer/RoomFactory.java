package receptionproducer;

import java.util.ArrayList;

public class RoomFactory {
	
	ArrayList<Room> category=new ArrayList<Room>();

			
	public ArrayList<Room> getRooms() {
	
		category.add(new StandardRoom());
		category.add(new LuxuryRoom());
		return  category;
		
	}
	public Room getRoom(String type)
	{
		if(type.equalsIgnoreCase("Standard Room"))
			return new StandardRoom();
		else if(type.equalsIgnoreCase("Luxury Room"))
			return new LuxuryRoom();
		else
			return null;
			
	}
}

package receptionproducer;

import java.util.ArrayList;

public class StandardRoom implements Room{
	private String name="Standard room";
	private double cost=10000;
	private String description="Offering a commodious 305 square feet, "
			+ "Standard Rooms at the Hotel Sapphire are cosy and warm,"
			+ " yet well equipped with the essentials a guest might need."
			+ " Located on the 1st and 2nd floors, we offer easy access to the city outside.";
	
	

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("--------------------------");
		System.out.println("Room Name: "+name);
		System.out.println("Room cost: "+cost);
		System.out.println("Description: "+description);
		System.out.println("--------------------------"+"\n");
	}
	public double getCost() {
		return cost;
	}
	



}

package receptionproducer;

import java.util.ArrayList;

public class LuxuryRoom implements Room{
	private String name="Luxury room";
	private double cost=250000;
	private String description="Luxury rooms offer an expansive 312 square feet of space "
			+ "and come equipped with either double"
			+ " or twin sharing beds and en-suite bathroom "
			+ "and shower facilities. Separate seating areas in the room are ideal for business travelers looking to get some work done or to simply enjoy a coffee,"
			+ " gazing out the window observing the hustle and bustle of Colombo.";

	
	@Override
	public void printDetails() {
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

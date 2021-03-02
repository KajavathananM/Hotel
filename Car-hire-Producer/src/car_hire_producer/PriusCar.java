package car_hire_producer;

import java.util.ArrayList;

public class PriusCar implements Car{
	
	private String name="Prius car";
	private double cost=13000;
	private String description="Luxury Car || with or without driver||  ";
	//private ArrayList <String>items=new ArrayList<String>();
	

	@Override
	public void printDetails() {
		System.out.println("--------------------------");
		System.out.println("Car Name: "+name);
		System.out.println("Car cost: "+cost);
		System.out.println("Description: "+description);
		System.out.println("--------------------------");
		
		
	}
	

}

package car_hire_producer;

import java.util.ArrayList;

public class KDHvan implements Car{
	
	private String name="KDH Van";
	private double cost=12000;
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

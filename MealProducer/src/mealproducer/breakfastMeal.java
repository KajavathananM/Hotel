package mealproducer;

import java.util.ArrayList;

public class breakfastMeal implements meals{
	
	private String name="BreakFast";
	private double cost=1500;
	private String description= "Eggs with bread ";

	
	
	@Override
	public void printDetails() {
		
		System.out.println("--------------------------");
		System.out.println("Meal Name: "+name);
		System.out.println("Meal cost: "+cost);
		System.out.println("Description: "+description);
		System.out.println("--------------------------");
	}

}

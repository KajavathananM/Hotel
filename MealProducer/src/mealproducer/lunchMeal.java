package mealproducer;

public class lunchMeal implements meals{
	
	private String name="Lunch";
	private double cost=2500;
	private String description= "Rice and curry ";

	
	
	@Override
	public void printDetails() {
		
		System.out.println("--------------------------");
		System.out.println("Meal Name: "+name);
		System.out.println("Meal cost: "+cost);
		System.out.println("Description: "+description);
		System.out.println("--------------------------");
	}

}

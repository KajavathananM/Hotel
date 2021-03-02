package mealproducer;

public class dinnerMeal implements meals{

	private String name="Dinner";
	private double cost=3500;
	private String description= "Fried Rice ";

	
	
	@Override
	public void printDetails() {
		
		System.out.println("--------------------------");
		System.out.println("Meal Name: "+name);
		System.out.println("Meal cost: "+cost);
		System.out.println("Description: "+description);
		System.out.println("--------------------------");
	}
}

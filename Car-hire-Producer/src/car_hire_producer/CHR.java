package car_hire_producer;

public class CHR implements Car{
	
	private String name="CHR car";
	private double cost=8000;
	private String description="Luxury Car || with or without driver||  ";
		

	@Override
	public void printDetails() {
		
		System.out.println("--------------------------");
		System.out.println("Car Name: "+name);
		System.out.println("Car cost per day : "+cost);
		System.out.println("Description: "+description);
		System.out.println("--------------------------");
		
	}

}

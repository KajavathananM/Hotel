package mealproducer;

import java.util.ArrayList;



public class MealFactory {
	
	ArrayList <meals>category=new ArrayList();
	
	void displayMeals() {
		
		category.add(new breakfastMeal());
		category.add(new lunchMeal());
		category.add(new dinnerMeal());
		
		for(meals meal:category)
		{
			meal.printDetails();
		}
	}
	
	double orderMeals(int option, int amt){
		
		double a;
		
		if ( option == 1 ) {
			 a = 1500.00*amt;
			 System.out.println("Total for breakfast is " +a);
			return a;
		}else if(option == 2) {
			 a = 2500.00*amt;
			 System.out.println("Total for lunch is " +a);
			return a;
		}else if(option == 3) {
			 a = 3500.00*amt;
			 System.out.println("Total for dinner is " +a);
			return a;
		}else {
			return 0;
		}
		
	}

}

package mealproducer;

public class MealServiceImpl implements MealService{

	@Override
	public void viewMeals() {
		
		MealFactory mealfactory = new MealFactory();
		mealfactory.displayMeals();
		
	}

	@Override
	public void bookMeals(int option, int amt) {
		MealFactory mealfactory = new MealFactory();
		mealfactory.orderMeals(option,amt);
		
	}

}

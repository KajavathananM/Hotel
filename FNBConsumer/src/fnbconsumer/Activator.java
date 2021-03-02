package fnbconsumer;

import java.util.Scanner;
import mealproducer.MealService;
//import receptionproducer.MealService;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;



public class Activator implements BundleActivator {
	ServiceReference serviceReference;
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		Scanner in =new Scanner(System.in);
		int option;
		System.out.println("Customer Service Started");
		serviceReference=context.getServiceReference(MealService.class.getName());
		MealService MealService=(MealService)context.getService(serviceReference);
		System.out.println("=====Welcome to Brown Hotel========");
		System.out.println("Do you want to view or order ? ");
		System.out.println("View Meals  -  1");
		System.out.println("Order Meals -  2");
		
		System.out.println("===================================");
		System.out.print("Enter your option: ");
		option= in.nextInt();
		
		if(option == 1){
			MealService.viewMeals();
		}else if(option == 2) {
			System.out.println("===================================");
			System.out.println("Breakfast - 1");
			System.out.println("Lunch     - 2");
			System.out.println("Dinner    - 3");
			System.out.println("===================================");
			System.out.print("Enter your meal(Type option) : ");
			int meal = in.nextInt();
			System.out.print("Enter your amount: ");
			int amt = in.nextInt();
			MealService.bookMeals(meal,amt);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Customer Service stopped");
		context.ungetService(serviceReference);
		
	}

}
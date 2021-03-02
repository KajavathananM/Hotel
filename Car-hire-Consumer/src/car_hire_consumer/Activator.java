package car_hire_consumer;

import car_hire_producer.CarHireService;  
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;



public class Activator implements BundleActivator {
	
	ServiceReference serviceReference;

	
	int option1;
	int days;
	public void start(BundleContext bcontext) throws Exception {
		
		Scanner in=new Scanner(System.in);
		String option;
		
		System.out.println("Car-Hire Service Started");
		serviceReference=bcontext.getServiceReference(CarHireService.class.getName());
		CarHireService carhireService=(CarHireService) bcontext.getService(serviceReference);
		System.out.println("=====Welcome to Brown Hotel========");
		System.out.println("View Cars (1):");
		System.out.println("Book Cars for Hire  (2):");
		System.out.println("===================================");
		System.out.print("Enter option: ");
		option=in.nextLine();
		if("1".equals(option)){
			carhireService.viewCars();
		}else if("2".equals(option)) {
			carhireService.bookCar(option1,days);
		}
		//Activator.context = bundleContext;
	}

	public void stop(BundleContext bcontext) throws Exception {
		System.out.println("Car Service stopped");
		bcontext.ungetService(serviceReference);

		//Activator.context = null;
	}

}

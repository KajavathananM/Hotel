package car_hire_producer;

import org.osgi.framework.BundleActivator; 
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class Activator implements BundleActivator {
	
	 ServiceRegistration carServiceRegistration;


	
	public void start(BundleContext bcontext) throws Exception {
		
		System.out.println("Car-Hire Recep Service Started");
		CarHireService carhireService=new CarHireServiceImpl();
		carServiceRegistration=bcontext.registerService(CarHireService.class.getName(),carhireService, null);
		//Activator.context = bundleContext;
	}

	public void stop(BundleContext bcontext) throws Exception {
		System.out.println("Car-Hire Recep Service  Stopped");
		carServiceRegistration.unregister();
		//Activator.context = null;
	}

}

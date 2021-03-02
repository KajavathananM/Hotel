package customerconsumer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import managerproducer.ManagerService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

import receptionproducer.ReceptionService;

public class Activator implements BundleActivator {
	ServiceReference serviceReferenceFromReception;
	ServiceReference serviceReferenceFromManager;
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		Scanner in=new Scanner(System.in);
		String option;
		System.out.println("Customer Service Started");
		
		serviceReferenceFromReception=context.getServiceReference(ReceptionService.class.getName());
		ReceptionService receptionService=(ReceptionService) context.getService(serviceReferenceFromReception);
			
		serviceReferenceFromManager=context.getServiceReference(ManagerService.class.getName());
		ManagerService managerService=(ManagerService) context.getService(serviceReferenceFromManager);
		
			System.out.println("========Reception Service for Customer====="+"\n");
			System.out.println("View type of Rooms   (1)");
			System.out.println("Book a room          (2)");
			System.out.println("==============================="+"\n");
			System.out.print("Enter option: ");
		    option=in.nextLine();
			
			  
			if(option.equals("1")) {
			   	receptionService.viewRooms();
			}else if(option.equals("2"))
			{
				managerService.confirmBooking(receptionService.bookRoom());
			}else {
				System.out.println("Please type valid option");
			}
		
	
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Customer Service stopped");
		context.ungetService(serviceReferenceFromManager);
		context.ungetService(serviceReferenceFromReception);
		
	}

}

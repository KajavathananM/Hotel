package managerproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {
	ServiceRegistration managerServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Manager Service Started");
		ManagerService managerService=new  ManagerServiceImpl();
	    managerServiceRegistration=context.registerService(ManagerService.class.getName(), managerService, null);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Manager Service stopped");
		managerServiceRegistration.unregister();
	}

}

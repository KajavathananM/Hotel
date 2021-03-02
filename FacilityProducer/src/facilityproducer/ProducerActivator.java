package facilityproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import apps.FacilityServices;
import apps.FacilityServicesImpl;

/**
 * The activator class controls the plug-in life cycle
 */
public class ProducerActivator implements BundleActivator {

	@SuppressWarnings("rawtypes")
	ServiceRegistration serviceRegisterer;
		
	@Override																					//Lifecycle method 'start'
	public void start(BundleContext context) throws Exception {
		System.out.println("============Producer service started.============");
		FacilityServices facserv = new FacilityServicesImpl();
		serviceRegisterer = context.registerService(FacilityServices.class.getName().toString(), facserv, null);
	}

	@Override																					//Lifecycle method 'stop'
	public void stop(BundleContext context) throws Exception {
		System.out.println("************Producer service stopped.************");
		serviceRegisterer.unregister();
	}


}

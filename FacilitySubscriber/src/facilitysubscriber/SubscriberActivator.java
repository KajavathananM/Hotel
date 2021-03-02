package facilitysubscriber;

import apps.FacilityServices;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import receptionproducer.Activator;

/**
 * The activator class controls the plug-in life cycle
 */
public class SubscriberActivator implements BundleActivator {
	JFrame window;
	JButton facilityBtn;
	//JButton receptionBtn;

	@SuppressWarnings("rawtypes")
	ServiceReference FacilityServiceReference;
	@SuppressWarnings("rawtypes")
	ServiceTracker CustomerServiceTracker;
	
	@Override																							//Lifecycle method 'start'
	public void start(BundleContext context) throws Exception {
		System.out.println("Facility subscriber started...");
		FacilityServiceReference = context.getServiceReference(FacilityServices.class.getName());
		@SuppressWarnings("unchecked")
		FacilityServices facServ = (FacilityServices) context.getService(FacilityServiceReference);		//Instance from the producer class
	
		
		System.out.println("--------------------------------------------");								//Subscribers GUI work starts here
		
		this.GUIPacker();
		window.setVisible(true);
		
		/*receptionBtn.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unchecked")
			@Override
			public void actionPerformed(ActionEvent e) {
				//==================================	
				JOptionPane.showMessageDialog(window, "To start the service please proceed through console. Thank You");
				window.setVisible(false);
					try {
						CustomerServiceTracker = new ServiceTracker(
								context,
								context.createFilter(
								"(&(objectClass="+Activator.class.getName()+")"+"(Language=*))"), 
								null);
					} catch (InvalidSyntaxException e1) {
						// TODO Auto-generated catch block
						System.out.println("Added Block Exception");
						e1.printStackTrace();
					}
					

					
					CustomerActivator act = (CustomerActivator) CustomerServiceTracker.getService();
					try {
						act.stop(FrameworkUtil.getBundle(CustomerActivator.class).getBundleContext());
						//act is the producersActivator
						act.start(FrameworkUtil.getBundle(CustomerActivator.class).getBundleContext());
					} catch (Exception e1) {
						System.out.println("Added Block Exception 2");
						e1.printStackTrace();
					}
				//=================================

							

			
				
			}
		});*/
		
		
		facilityBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double payment=0;
				int option=0; 
				double hrs=1;
				
				String optionString="0";
				String hrsString ="0";
				
				try{
					//Additional Facility Input
				
						optionString = (JOptionPane.showInputDialog(
					            window,
					            facServ.getService(),
					            "Enter Desired Facility : ",
					            JOptionPane.QUESTION_MESSAGE));
						option=Integer.parseInt(optionString);
						

						
						//Time period
						if(option != 3) {
						 hrsString = (JOptionPane.showInputDialog(
						            window,
						            "Enter number of hours : ",
						            "Hours input dialog",
						            JOptionPane.QUESTION_MESSAGE));
							
						hrs=Double.parseDouble(hrsString);
						}
						
						
						//If Pub and bar is selected, input prompt for hours will not be 
						//executed.
						if(option == 3) {
							int[] recieve = new int[3];
							recieve = pubandBar(facServ.getBarService());
							payment = facServ.barSubService(recieve[0],recieve[1]);	//Bar value is calculated from producer
						}else {
							payment = facServ.priceCalculator(option,hrs);//Final bill is calculated from producer
						}
						
						if(payment == -1 || payment<0 || payment == 0) {
							JOptionPane.showMessageDialog(window, "Invalid input please try again...");
							window.setVisible(false);
							window.dispose();
						}else {
							JOptionPane.showMessageDialog(window, "Thank You. Total is : Rs."+payment);
						}
						
					
				}catch(Exception ex) {
					System.out.println("Exception : "+ex);
					JOptionPane.showMessageDialog(window, "Invalid input please try again...");
					window.setVisible(false);
					window.dispose();
				}
				
				
			}
		});
		
		
			
		System.out.println("--------------------------------------------");
	}


	
	public int[] pubandBar(String data) {				//Bar details prompt
		int[] values = new int[3];
		int opt=0;
		int bottles=0;
		

		
				String o = JOptionPane.showInputDialog(
			            window,
			            data,
			            "Enter Desired beverage : ",
			            JOptionPane.QUESTION_MESSAGE);
				
				opt= Integer.parseInt(o);
				
				String b = JOptionPane.showInputDialog(
			            window,
			            "Enter number of bottles : ",
			            "Bottles",
			            JOptionPane.QUESTION_MESSAGE);
				
				bottles = Integer.parseInt(b);
			
				if(o.equals(null)||b.equals(null)) {
					JOptionPane.showMessageDialog(window, "Invalid input please try again...");
					window.setVisible(false);
					window.dispose();
				}
				
			values[0]=opt;
			values[1]=bottles;
			return values;
	} 
	
	
	public void GUIPacker() {									//GUI Builder for user convenience
		window = new JFrame("Welcome to Hotel System");
	    window.setSize( 450, 300 );
	    window.setLayout(new BorderLayout());
	    window.setLocationRelativeTo(null);
	    
	    window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    JLabel back = new JLabel(new ImageIcon(this.getClass().getResource("/resources/Cropped(1).jpg")));
	    
	    GridBagLayout grid = new GridBagLayout();
	    GridBagConstraints c = new GridBagConstraints();
	    c.fill = GridBagConstraints.HORIZONTAL;
	    
	    
	    back.setLayout(grid);
	    back.setSize(450,300);
	    facilityBtn = new JButton("Facilities");
	    
	    facilityBtn.setBackground(new Color(0,0,60));
	    facilityBtn.setFont(new Font("Century Gothic",Font.PLAIN,11));
	    facilityBtn.setForeground(new Color(255,255,255));
	    facilityBtn.setPreferredSize(new Dimension(100, 20));
	    
	   /* receptionBtn = new JButton("Reception");
	    
	    receptionBtn.setBackground(new Color(0,0,60));
	    receptionBtn.setFont(new Font("Century Gothic",Font.PLAIN,11));
	    receptionBtn.setForeground(new Color(255,255,255));
	    receptionBtn.setPreferredSize(new Dimension(100, 20));*/
	    
	    JLabel label = new JLabel("Please select a service.");
	    label.setForeground(Color.WHITE);
	    label.setFont(new Font("Century Gothic",Font.BOLD,18));

	    
	    window.setResizable(false);
	    c.gridwidth=1;
	    c.gridheight=1;
	    c.gridx=0;
	    c.gridy=0;
	    c.ipady=40;
	    
	    
	    grid.setConstraints(label, c);
	    back.add(label);
	    
	    c.gridwidth=1;
	    c.gridheight=1;
	    c.gridx=0;
	    c.gridy=3;
	    c.ipady=0;
	    grid.setConstraints(facilityBtn, c);
	    back.add(facilityBtn);

	    /*c.gridwidth=1;
	    c.gridheight=1;
	    c.gridx=0;
	    c.gridy=6;
	    c.ipady=0;
	    grid.setConstraints(receptionBtn, c);
	    back.add(receptionBtn);*/
	    
	    window.getContentPane().add(back);
	    
	    window.pack();
	    window.setVisible(false);
	}

	
	@Override																		//Lifecycle method 'stop'
	public void stop(BundleContext context) throws Exception {
		context.ungetService(FacilityServiceReference);
	}
}

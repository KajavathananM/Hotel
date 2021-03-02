import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;


import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;

public class SimpleAppGUI {

	protected Shell shlHotelServiceSystem;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SimpleAppGUI window = new SimpleAppGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlHotelServiceSystem.open();
		shlHotelServiceSystem.layout();
		while (!shlHotelServiceSystem.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlHotelServiceSystem = new Shell();
		Image image = SWTResourceManager.getImage("C:\\Users\\dinit\\OneDrive\\Desktop\\Cropped(1).jpg");
		
		shlHotelServiceSystem.setSize(450, 300);
		shlHotelServiceSystem.setText("Hotel Service System");
		shlHotelServiceSystem.setBackgroundImage(image);
		
		
		Button btnFacilities = new Button(shlHotelServiceSystem, SWT.NONE);
		btnFacilities.setTouchEnabled(true);
		btnFacilities.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btnFacilities.setLocation(174, 144);
		btnFacilities.setSize(75, 25);
		btnFacilities.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		btnFacilities.setText("Facilities");
		
		Label lblWelcomeToHotel = new Label(shlHotelServiceSystem, SWT.CENTER);
		lblWelcomeToHotel.setLocation(0, 40);
		lblWelcomeToHotel.setSize(434, 21);
		lblWelcomeToHotel.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		lblWelcomeToHotel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		lblWelcomeToHotel.setFont(SWTResourceManager.getFont("Century Gothic", 11, SWT.BOLD));
		lblWelcomeToHotel.setText("Welcome to Hotel Services System");
		
		Label lblPleaseSelectThe = new Label(shlHotelServiceSystem, SWT.CENTER);
		lblPleaseSelectThe.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		lblPleaseSelectThe.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		lblPleaseSelectThe.setLocation(0, 80);
		lblPleaseSelectThe.setSize(434, 21);
		lblPleaseSelectThe.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 10, SWT.NORMAL));
		lblPleaseSelectThe.setText("Please select the desired service.");

	}
}

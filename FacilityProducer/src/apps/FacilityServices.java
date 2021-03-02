package apps;

public interface FacilityServices {
	public String getService();
	public double priceCalculator(int choice,double hrs);
	public double barSubService(int c,int qty);
	public String getBarService();
}

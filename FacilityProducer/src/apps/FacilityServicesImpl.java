package apps;

import java.util.Scanner;

public class FacilityServicesImpl implements FacilityServices{
	
	Scanner scannerInput = new Scanner(System.in);
	double billValue;
	
	static double WhiskeyPrice = 4000;
	static double BrandyPrice = 3000;
	static double BeerPrice = 500;
	static double VodkaPrice = 6500;
	
	
	@Override
	public String getService() {
		return("Welcome to Facilities Section \n"
				+ "1\t:\tGymnasium (Per hour : Rs.100)\n"
				+ "2\t:\tSwimming Pool (Per hour : Rs.300)\n"
				+ "3\t:\tPub and Bar\n"
				+ "4\t:\tJacuzzi and Spa (Per hour : Rs.2500) \n ");
			
//		billValue = priceCalculator();
//		System.out.println("Your Bill Value is : "+billValue);
	}
	
	public String getBarService() {
		return ("1: \tWhiskey : Rs."+WhiskeyPrice+"\n"
				+ "2: \tBrandy : Rs."+BrandyPrice+"\n"
				+ "3: \tBeer : Rs."+BeerPrice+"\n"
				+ "4: \tVodka : Rs."+VodkaPrice+"\n");
	}
	
	public double priceCalculator(int choice,double hrs) {

		double hourlyRate=0;
		double total=0;
		
		while(choice<=0 || hrs<=0) {
		
		if(choice == 3) {
			hrs =1;
		}
		
		}
		
		if(choice == 1) {
			hourlyRate = 100;
			total = hourlyRate * hrs;
		}else if(choice == 2) {
			hourlyRate = 300;
			total = hourlyRate * hrs;
		}else if(choice == 3) {
			
		}else if(choice == 4) {
			hourlyRate = 2500;
			total = hourlyRate * hrs;
		}else {
			total = -1;
		}
		
		return total;
	}
	
	public double barSubService(int c,int qty) {
		System.out.println("In here "+c+qty);
		double WhiskeyPrice = 4000;
		double BrandyPrice = 3000;
		double BeerPrice = 500;
		double VodkaPrice = 6500;
		
		double price=0;
		
		if(c == 1) {
			price = WhiskeyPrice * qty;
		}else if(c == 2) {
			price = BrandyPrice * qty;
		}else if(c == 3) {
			price = BeerPrice * qty;
		}else if(c == 4) {
			price = VodkaPrice * qty;
		}else {
			price=-1;
		}
		return price;
	}

}

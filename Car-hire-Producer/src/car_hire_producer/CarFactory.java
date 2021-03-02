package car_hire_producer;

import java.util.ArrayList;



public class CarFactory {
	ArrayList <Car>category=new ArrayList();
	void displayCars() {
		category.add(new CHR());
		category.add(new KDHvan());
		category.add(new PriusCar());
		for(Car car:category)
		{
			car.printDetails();
		}
	}
	
	
	double bookCar(int option,int days) {
		
		double b;
		if(option==1) {
			b=8000.00*days;
			System.out.println("Number of Days :"+days);
			System.out.println("Total for CHR is "+b);
			return b;
		}else if(option==2) {
		
		b=12000.00*days;
		System.out.println("Number of Days :"+days);
		System.out.println("Total for KDH "+b);
		return b;
		}else if(option==3) {
			b=13000.00*days;
			System.out.println("Number of Days :"+days);
			System.out.println("Total for PRIUS "+b);
			return b;
			
		}else
		{
			return 0;
		}
	}

}

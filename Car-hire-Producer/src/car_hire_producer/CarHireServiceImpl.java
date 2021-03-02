package car_hire_producer;

import java.util.Scanner;



public class CarHireServiceImpl implements CarHireService{

	public void viewCars() {
		
		CarFactory carFactory=new CarFactory();
		carFactory.displayCars();
	}

//	//@Override
//	public void bookCar() {
//		
//		int option,days;
//		Scanner in=new Scanner(System.in);
//		
//		System.out.println("Enter Car name: ");
//		System.out.println("Type of Car: ");
//		
//		
//	}

	@Override
	public void bookCar(int option, int days) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		System.out.println("CHR-option1 || PRIUS -option2 || KDH - option 3");
		System.out.print("Enter option :");
		option = scn.nextInt();
		System.out.print("Enter Number of days :");
		days=scn.nextInt();
		CarFactory carFactory=new CarFactory();
		carFactory.bookCar(option,days);
		
	}

}

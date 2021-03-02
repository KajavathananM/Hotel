package receptionproducer;

import java.util.Date;

public class BookedCustomer extends NewCustomer{
	private NewCustomer newCustomer;
	private int noOfDays;
	private int roomCost;
	
	public BookedCustomer(NewCustomer newCustomer)
	{
		this.newCustomer=newCustomer;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return newCustomer.getName();
	}
	
	@Override
	public String getRoomType() {
		// TODO Auto-generated method stub
		return newCustomer.getRoomType();
	}
	
	@Override
	public String getContactNo() {
		// TODO Auto-generated method stub
		return newCustomer.getContactNo();
	}
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return newCustomer.getEmail();
	}
	@Override
	public int getNoOfAdults() {
		// TODO Auto-generated method stub
		return newCustomer.getNoOfAdults();
	}
	@Override
	public int getNoOfChildren() {
		// TODO Auto-generated method stub
		return newCustomer.getNoOfChildren();
	}
	@Override
	public int getNoOfRooms() {
		// TODO Auto-generated method stub
		return newCustomer.getNoOfRooms();
	}
	@Override
	public Date getCheckInTime() {
		// TODO Auto-generated method stub
		return newCustomer.getCheckInTime();
	}
	
	@Override
	public Date getCheckOutTime() {
		// TODO Auto-generated method stub
		return newCustomer.getCheckOutTime();
	}
	
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public int getRoomCost() {
		return roomCost;
	}
	public void setRoomCost(int roomCost) {
		this.roomCost = roomCost;
	}
	
}

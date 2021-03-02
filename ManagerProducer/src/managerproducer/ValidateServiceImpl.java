package managerproducer;

import java.util.ArrayList;

import receptionproducer.NewCustomer;

public class ValidateServiceImpl implements ValidateService{

	@Override
	public boolean verifyName(String name) {
		if(name.isEmpty())
		{
			System.out.println("Please enter a name");
			return true;
		}else{
			return false;
		}

	}

	@Override
	public boolean verifyEmail(String email) {
		
		if(email.isEmpty())
		{
			System.out.println("Please enter an email");
			return true;
		}
		else if(!email.contains("@") || !email.contains(".com"))
		{

				
			System.out.println("Please enter valid email");
			return true	;		
		}

		else if(!email.contains("@") && !email.contains(".com"))
		{

					
			System.out.println("Please enter valid email");
			return true	;		
		}
			
			
		else
		{
			return false;
		}
			
	
		
		
	}

	@Override
	public boolean verifyContactNo(String contactNo) {
		if(contactNo.isEmpty())
		{
			System.out.println("Please enter a contact Number");
			return true;
		}
		else if(!contactNo.startsWith("0") || contactNo.length() != 10 )
		{
					
			System.out.println("Please enter valid contact Number");
			return true;			
				
		}	
		else if(!contactNo.startsWith("0") && contactNo.length() != 10 )
		{
					
			System.out.println("Please enter valid contact Number");
			return true;			
				
		}	
		else {
			return false;
		}
		

	}

	@Override
	public boolean verifyAll(NewCustomer newCustomer) {
		ArrayList<Boolean> list=new ArrayList<>();
		list.add(verifyName(newCustomer.getName()));
		list.add(verifyEmail(newCustomer.getEmail()));
		list.add(verifyContactNo(newCustomer.getContactNo()));
		
		if(list.contains(true)) {
			return true;
		}else {
			return false;
		}
	
		
	
		
	}


	


	
	
}

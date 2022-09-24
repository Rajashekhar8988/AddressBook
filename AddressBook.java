package bridgeLabz.AddressBook;

import java.util.Scanner;

class ContactDetails {
	  
	//Creating properties of personDetails class
	
	public static String firstName;
	public static String lastName;
	public static String address;
	public static String emailId;
	public static String state;
	public static long phoneNumber;
	public static long zipCode;
	  	
	
	    public void setFirstName(String input){
	        this.firstName = input;
	    }
	    public String getFirstName(){
	        return firstName;
	    }

	    public void setLastName(String input){
	        this.lastName = input;
	    }
	    public String getLastName(){
	        return lastName;
	    }

	    public void setAddress(String input){
	        this.address = input;
	    }
	    public String getAddress(){
	        return address;
	        
	    }public void setemailId(String input){
	        this.emailId = input;
	    }
	    public String getemailId(){
	        return emailId;
	    }
	    
	    public void setstate(String input){
	        this.state = input;
	    }
	    public String getstate(){
	        return state;
	    }
	    
	    public void setPhoneNumber(long input){
	        this.phoneNumber = input;
	    }
	    public long getPhoneNumber(){
	        return phoneNumber;
	    }

	    public void setzipCode(long input){
	        this.zipCode = input;
	    }
	    public long getzipCode(){
	        return zipCode;
	    }

	   public void displayContactDetails(){
	      
		System.out.println("Hello Mr/Mrs " +firstName+ " Wlcome to AddressBook");
		System.out.println("Name : "+firstName +" "+lastName);
		System.out.println("Address : "+address);
		System.out.println("EmailId : "+emailId);
		System.out.println("State : "+state);
		System.out.println("phone Number : "+phoneNumber);
		System.out.println("Zipcode : "+zipCode);
	}
}
	public class AddressBook extends ContactDetails {  
		AddressBook(String firstName,String lastName,String address, String emailId, String state, long phoneNumber, long zipCode)
	    {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.address = address;
	        this.emailId = emailId;
	        this.state = state;
	        this.phoneNumber = phoneNumber;
	        this.zipCode = zipCode;
	    }
	    public static void main(String args[]) {  
	    	
	        //Creating object of personDetails class 
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter you First name :");
	    	firstName=sc.next();
	    	System.out.println("Enter you Last name :");
	    	String lastName=sc.next();
	    	System.out.println("Enter you Address name :");
	    	String address=sc.next();
	    	System.out.println("Enter you email name :");
	    	String email=sc.next();
	    	System.out.println("Enter you state name :");
	    	String state=sc.next();
	    	System.out.println("Enter you phoneNumber name :");
	    	long phoneNumber=sc.nextInt();
	    	System.out.println("Enter you zipCode name :");
	    	long zipCode=sc.nextInt();
	    	
	    	AddressBook person1 = new AddressBook(firstName,lastName,address,emailId,state,phoneNumber,zipCode);
	    	person1.displayContactDetails();
	    	
	    }
	}


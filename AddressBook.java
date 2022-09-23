package bridgeLabz.AddressBook;

class personDetails {
	  
	//Creating properties of personDetails class
	
	public static String firstName;
	public static String lastName;
	public static String address;
	public static String email;
	public static String state;
	public static long phoneNumber;
	public static long zipCode;
	  
	//constructor to initialize the properties at the time of object creation
	
	personDetails(String firstName,String lastName, String address, String email, String state, long phoneNumber, long zipCode){
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.email=email;
		this.state=state;
		this.phoneNumber=phoneNumber;
		this.zipCode=zipCode;
		
	}
	
	public void showDetails() {
		System.out.println("Hello Mr/Mrs " +firstName+ " your details are :");
		System.out.println("Name is : "+firstName +" "+lastName);
		System.out.println("Address : "+address);
		System.out.println("Email : "+email);
		System.out.println("State : "+state);
		System.out.println("phone Number : "+phoneNumber);
		System.out.println("Zipcode : "+zipCode);

		
	}
}
	public class AddressBook{  
	    public static void main(String args[]) {  
	          
	        //Creating object of personDetails class  
	    	personDetails obj = new personDetails("Rajashekhar","Reddy","Nagaram","abc@gmail.com","Telangana",123456789,543210);  
	        obj.showDetails();
	                 

	    }
	}

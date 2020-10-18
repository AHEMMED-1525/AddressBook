import java.util.Scanner;

 class Address{
		public void contactDetails(){
			Scanner input=new Scanner(System.in);

			System.out.print("Enter your First name : ");
			String firstName=input.nextLine();

         System.out.print("Enter your Last name : ");
         String lastName=input.nextLine();

         System.out.print("Enter your Address : ");
         String Address=input.nextLine();

         System.out.print("Enter your City name : ");
         String city=input.nextLine();

         System.out.print("Enter your Email id : ");
         String email=input.nextLine();

         System.out.print("Enter your state : ");
         String state=input.nextLine();

         System.out.print("Enter your Pincode : ");
         int pinCode=input.nextInt();

         System.out.print("Enter your Phone number : ");
         long phoneNumber=input.nextLong();


			System.out.println("First name : " +firstName +"\n"
										 +"Last name :"+lastName+"\n"
										 +"Address : "+ Address+ "\n"
										 +"City : " +city +"\n"
										 +"State : "+state+"\n"
										 +"Pincode : "+pinCode+"\n"
										 +"Phone number : "+phoneNumber+"\n"
										 +"Email : " +email);
			}
}
public class AddressBook{
			public static void main(String[] args){
			Address addressbook=new Address();
			addressbook.contactDetails();
		}
}






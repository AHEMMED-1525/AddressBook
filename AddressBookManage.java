public class AddressBookManage{
	private String firstName;
	private String lastName;
	private String address;
	private String city ;
	private String state;
	private String pinCode ;
	private String phone;
	private String email;

public AddressBookManage(){


			System.out.println("First name : " +firstName +"\n"
										 +"Last name :"+lastName+"\n"
										 +"Address : "+ address+ "\n"
										 +"City : " +city +"\n"
										 +"State : "+state+"\n"
										 +"Pincode : "+pinCode+"\n"
										 +"Phone number : "+phone+"\n"
										 +"Email : " +email);
			}
	@Override
	public String toString() {
		return " firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				     + ", city=" + city +", state= "+state + ", pinCode=" + pinCode + ", email=" + email ;
	}
}

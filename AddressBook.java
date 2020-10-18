import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class AddressBook{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		List<AddressBookManage> array = new LinkedList<AddressBookManage>();
		array.add(new AddressBookManage("Ahemmed", "Hussain " ," 7Th lane ", "Giddalur", " Andhra pradesh", "523357" , "7730851594", " ahemmed1525@gmail.com"));
		array.add(new AddressBookManage( " Harish " , " Kanumarlapudi " ," Prashanthi nagar", " Ammerpet", " Hyderabad ", " 500082" ,"8349610084", "harish123@gmail.com"));
		array.add(new AddressBookManage( " Chakram " , " Katam " ,"Street no 9" , "nizampet", " Secunderabad ", " 500092" ," 500032" ,"8297038874", "chakram@gmail.com"));
		System.out.println("Enter one choice 1. Add data  2. Edit data ");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:	for(AddressBookManage address:array)
			 		{
				 		System.out.println(address);
			 		}
			break;
			case 2 :for(AddressBookManage address:array)
					{
					System.out.println(address);
					}
					System.out.println("\n Enter the position to be edited ");
					int select=sc.nextInt();
					array.remove(select-1);
					array.add(new AddressBookManage(" kati " , " dane " ," 10ThAvenue ", " Mumbai ", " 539 123" , "katynin234@gmail.com"));
					for(AddressBookManage address:array)
					{
					System.out.println(address);
					}
			break;
			default: System.out.println("Enter a valid choice");
		}
		sc.close();
	}
}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
/**
 * create a Contacts in Address Book
Book. with multiple contact
 */
	private static Scanner scanner = new Scanner(System.in);
	static List<Person> personList = new ArrayList<>();
	

	private void add() {
		Person person = new Person();
		for (int i = 0; i < personList.size(); i++) {
			{
				System.out.println("Enter fname:");
				person.setFirstName(scanner.next());
				System.out.println("Enter Lname:");
				person.setLastName(scanner.next());
				System.out.println("Enter Address:");
				person.setAddress(scanner.next());
				System.out.println("city:");
				person.setCity(scanner.next());
				System.out.println("State:");
				person.setState(scanner.next());
				System.out.println("ip:");
				person.setZip(scanner.next());
				System.out.println("Phone:");
				person.setPhone(scanner.next());
				System.out.println("Email:");
				person.setEmail(scanner.next());

				personList.add(person);
				System.out.println("Person added");
				String addressBookName = "mumbai";
				List<Person> personList = addressBookMap.get(addressBookName);
				person.setFirstName("sanyu");
				person.setLastName("nirmal");

				personList.add(person);
				addressBookMap.put(addressBookName, personList);
			}
		}
	}
	/**
 	* Edit Contact in Address
		Book.
 	*/
	
	private void edit() {
		System.out.println(" Enter first name to Edit");
		String setFirstName = scanner.next();
		if (personList.isEmpty()) {
			System.out.println("No records found");
			return;
		}
		for (int i = 0; i < personList.size(); i++) {
			Person person = new Person();
			if (personList.get(i).getFirstName().equals(setFirstName)) {
//				Person person = new Person();
				System.out.println("Enter fname:");
				person.setFirstName(scanner.next());
				scanner.nextLine();
				System.out.println("Enter Lname:");
				person.setLastName(scanner.next());
				scanner.nextLine();
				System.out.println("Enter Address:");
				person.setAddress(scanner.next());
				scanner.nextLine();
				System.out.println("city:");
				person.setCity(scanner.next());
				scanner.nextLine();
				System.out.println("State:");
				person.setState(scanner.next());
				System.out.println("Zip:");
				scanner.nextLine();
				person.setZip(scanner.next());
				System.out.println("Phone:");
				person.setPhone(scanner.next());
				scanner.nextLine();
				System.out.println("Email:");
				person.setEmail(scanner.next());
				scanner.nextLine();

				personList.remove(i);
				personList.add(i, person);
				System.out.println(personList);
			}
		}
		/**
        * Delete Contact in Address
                Book.
        */


	private void delete() {
		System.out.println(" Enter first name to delete");
		String setFirstName = scanner.next();
		if (personList.isEmpty()) {
			System.out.println("No records found");
			return;
		}
		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i).getFirstName().equals(setFirstName)) {
				personList.remove(i);
			}
		}
		System.out.println(personList);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to address book");
		AddressBook detail = new AddressBook();
		boolean isExit = false;

		while (!isExit) {
			System.out.println("Welcome to address book");

			System.out.println("Enter options 1.Add\n2.Edit\n3.Delete\n4.Exit\n5.Show Contact");
			int userInput = scanner.nextInt();

			switch (userInput) {
			case 1:
				// add
				detail.add();
				break;
	
			case 2:
				isExit = true;
				break;
			default:
				System.out.println(personList.toString());
			}
		}

	}

}


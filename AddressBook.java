
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
/**
 * create a Contacts in Address Book
Book.
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
			}
		}
	}

	private void edit() {
	

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


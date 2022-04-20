package uC3;

import java.util.ArrayList;
import java.util.Scanner;

public class UC3 {

		// TODO Auto-generated method stub
		private ArrayList<Contact> person; // An array of Contacts - each stores info for one friend

		public void AddressBookMain() {
			person = new ArrayList<Contact>();
		}
		// Add a contact that's passed in as a parameter.
		public void addContact(Contact c) {
			person.add(c);
		}
		/*
		 * menu() method for showing options user has
		 * */
		public static void menu()
		{
			System.out.println("Add a new contact to your address book.");
			System.out.println("Press 1 for Adding a new contact to your address book.");
			System.out.println("Press 2 for Editing Existing contact");
			System.out.println("Press 3 to Quit.");
		}

		/*
		 * haveContacts() method to return index of particular person in person array
		 * */
		int haveContact(String s) {
			for (int i = 0; i < person.size(); i++)
				if (person.get(i).getfName().equals(s))
					return i;

			return -1;
		}
		// method for Editing existing contact
		public void editContact(String s) {
			Scanner inp = new Scanner(System.in);
			int place = haveContact(s);
			if (place >= 0) {

				System.out.println("Enter Last name");
				String lname = inp.next();
				System.out.println("Enter Phone Number");
				int phoneNumber = inp.nextInt();
				System.out.println("Enter City");
				String city = inp.next();
				System.out.println("Enter State");
				String state = inp.next();
				System.out.println("Enter Pin Code");
				int pinCode = inp.nextInt();

				Contact obj = new Contact(s, lname, phoneNumber, city, state, pinCode);


				person.set(place, obj);
			} else if (place == -1) ;
			{
				System.out.println("\nFirst Name Not Match\n");
			}
		}

		public static void main(String[] args) {
			Scanner inp = new Scanner(System.in);
			UC3 obj = new UC3();
			menu();
			int choice = inp.nextInt();
			while (choice != 3) {

				if (choice == 1) {
					System.out.println("Enter First Name:");
					String fName = inp.next();
					System.out.println("Enter Last NAme");
					String lName = inp.next();
					System.out.println("Enter  phone number.");
					int number = inp.nextInt();
					System.out.println("Enter The City");
					String city = inp.next();
					System.out.println("Enter The State");
					String state = inp.next();
					System.out.println("Enter the pin code");
					int pinCode = inp.nextInt();
					obj.addContact(new Contact(fName, lName, number, city, state, pinCode));

					System.out.println("Enter First Name:");
					String fName1 = inp.next();
					System.out.println("Enter Last NAme");
					String lName1 = inp.next();
					System.out.println("Enter  phone number.");
					int number1 = inp.nextInt();
					System.out.println("Enter The City");
					String city1 = inp.next();
					System.out.println("Enter The State");
					String state1 = inp.next();
					System.out.println("Enter the pin code");
					int pinCode1 = inp.nextInt();
					obj.addContact(new Contact(fName1, lName1, number1, city1, state1, pinCode1));
				}
				else if (choice == 2) {
					//contact rv = new contact();
					System.out.println("Enter the First Name of the contact you want to edit?");
					String fName = inp.next();
					obj.editContact(fName);

				}
				choice = inp.nextInt();
			}
		}

	}


package uc4;

import java.util.ArrayList;
import java.util.Scanner;

public class UC4 {
	class AddressBookMain {
		private ArrayList<contact> person; // An array of Contacts - each stores info for one friend
		public AddressBookMain() {
			person = new ArrayList<contact>();
		}

		// Add a contact that's passed in as a parameter.
		/*
		 * addContact() to add new created contacts to address book
		 * */
		public void addContact(contact c) {
			person.add(c);
		}

		/*
		 * menu() method for showing options user has
		 * */
		public static void menu()
		{
			System.out.println("Press 1 for Adding a new contact to your address book.");
			System.out.println("Press 2 for Editing Existing contact");
			System.out.println("Press 3 for Deleting Existing Contact");
			System.out.println("Press 4 to Quit.");
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
		/*
		 *editContact() to edit existing contacts
		 **/
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
				contact obj = new contact(s, lname, phoneNumber, city, state, pinCode);
				person.set(place, obj);
			} else if (place == -1) ;
			{
				System.out.println("\nFirst Name Not Match\n");
			}
		}

		/**
		 * method for deleting contacts
		 */
		public void deleteContact(String s) {
			int place = haveContact(s);
			if (place >= 0)
				person.remove(place);
		}

		public static void main(String[] args) {
			Scanner inp = new Scanner(System.in);
			UC4 obj = new UC4();
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
					obj.addContact(new contact(fName, lName, number, city, state, pinCode));
				}
				else if (choice == 2) {
					//contact rv = new contact();
					System.out.println("Enter the First Name of the contact you want to edit?");
					String fName = inp.next();
					obj.addContact(fName);


				}
				else if (choice == 3) {
					System.out.println("What is the First name of the contact you want to delete?");
					String fName = inp.next();
					obj.addContact(fName);
				}
				choice = inp.nextInt();
			}
		}
	}

	public void addContact(String fName) {
		// TODO Auto-generated method stub

	}

	public void addContact(contact contact) {
		// TODO Auto-generated method stub

	}
}

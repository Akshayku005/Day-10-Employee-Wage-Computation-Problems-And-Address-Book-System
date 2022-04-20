package UC2;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Welcome to Address Book Program");

		UC2 book = new UC2();
		Contact person1 = new Contact(0);
		System.out.println("Enter First Name: ");
		person1.setFirstName(sc.nextLine());
		System.out.println("Enter Last Name: ");
		person1.setLastName(sc.nextLine());
		System.out.println("Enter Address: ");
		person1.setAddress(sc.nextLine());
		System.out.println("Enter City: ");
		person1.setCity(sc.nextLine());
		System.out.println("Enter State: ");
		person1.setState(sc.nextLine());
		System.out.println("Enter Zip Code: ");
		person1.setZip(sc.nextLine());
		System.out.println("Enter Phone Number: ");
		person1.setPhoneNumber(sc.nextLine());
		System.out.println("Enter E-Mail: ");
		person1.seteMail(sc.nextLine());
		System.out.println("Add More Entry?");

		book.setContact(person1);
		System.out.println("""
				=============================

				""");
		book.getContact();
		boolean toggle = true;
		while (toggle) {
			System.out.println("""
					1 -> Create new Contact
					2 -> Display Contacts
					0 -> Exit
					""");
			System.out.print("Choice: ");
			int choice = sc.nextInt();
			System.out.println("============================= \n");
			switch (choice) {
			case 1 -> {
				book.setContact();
				System.out.println("============================= \n");
			}
			case 2 -> {
				book.getContact();
				System.out.println("============================= \n");
			}
			case 0 -> {
				System.out.println("Address Book Closed.");
				toggle = false;
			}
			}
		}
	}
}

package UC2;

import java.util.ArrayList;
import java.util.Scanner;

public class UC2 {
	int index = 0;
	static Scanner sc = new Scanner(System.in);
	ArrayList<Contact> entry = new ArrayList<>();

	void setContact(Contact o){
		entry.add(o);
	}
	//contact obj
	//add details here
	void setContact(){
		Contact person = new Contact(index);
		System.out.println("Enter First Name: ");
		person.setFirstName(sc.nextLine());
		System.out.println("Enter Last Name: ");
		person.setLastName(sc.nextLine());
		System.out.println("Enter Address: ");
		person.setAddress(sc.nextLine());
		System.out.println("Enter City: ");
		person.setCity(sc.nextLine());
		System.out.println("Enter State: ");
		person.setState(sc.nextLine());
		System.out.println("Enter Zip Code: ");
		person.setZip(sc.nextLine());
		System.out.println("Enter Phone Number: ");
		person.setPhoneNumber(sc.nextLine());
		System.out.println("Enter E-Mail: ");
		person.seteMail(sc.nextLine());
		System.out.println("Add More Entry? ");
		entry.add(person);
		index ++;
	}

	void getContact(){
		for (Contact e: entry) {
			System.out.println("ID: " + e.id);
			System.out.println("First Name: " + e.firstName);
			System.out.println("Last Name: " + e.lastName);
			System.out.println("Address: " + e.address);
			System.out.println("City: " + e.city);
			System.out.println("State: " + e.state);
			System.out.println("Zip: " + e.zip);
			System.out.println("Phone Number: " + e.phoneNumber);
			System.out.println("E-Mail: " + e.eMail);
			System.out.println("E-Mail: " + e.eMail + "\n");
		}
	}
}
class Contact {
	int id;
	String address;
	String firstName;
	String lastName;
	String city;
	String state;
	String zip;
	String phoneNumber;
	String eMail;
	void getContact(){
		String phoneNumber;
		String eMail;
	}

	Contact(int index){
		this.id = index;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
}

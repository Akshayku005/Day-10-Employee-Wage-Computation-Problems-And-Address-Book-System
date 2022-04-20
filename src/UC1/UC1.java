package UC1;

import java.util.ArrayList;

public class UC1 {
	ArrayList<Contact> entry = new ArrayList<>();

	void setContact(Contact o){
		entry.add(o);
	}
	void getContact(){
		for (Contact e: entry) {
			System.out.println("First Name: " + e.firstName);
			System.out.println("Middle Name: " + e.middleName);
			System.out.println("Last Name: " + e.lastName);
			System.out.println("Address: " + e.address);
			System.out.println("City: " + e.city);
			System.out.println("State: " + e.state);
			System.out.println("Zip: " + e.zip);
			System.out.println("Phone Number: " + e.phoneNumber);
			System.out.println("E-Mail: " + e.eMail);
		}
	}
}
class Contact {
	String address;
	String firstName;
	String middleName;
	String lastName;
	String city;
	String state;
	String zip;
	String phoneNumber;
	String eMail;

	public void setAddress(String address) {
		this.address = address;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setMiddleName(String MiddleName) {
		this.middleName = middleName;
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

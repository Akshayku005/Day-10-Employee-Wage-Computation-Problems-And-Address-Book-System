package uc5;

import java.util.ArrayList;
import java.util.Scanner;

public class UC5 {

		static ArrayList<Contact> list = new ArrayList<Contact>();

		void addContact(Contact contact) {
			list.add(contact);
			System.out.println("Contact added successfully");
		}

		void deletePerson(String name, ArrayList<Contact> list) {
			if (list.size() == 0) {
				System.out.println("Address book is empty.Please Add First");
			} else {
				int m = 0;
				for (int i = list.size() - 1; i >= 0; --i) {
					if (list.get(i).firstName.contains(name)) {
						list.remove(i);
						System.out.println("Contact deleted successfully");
						m += 1;
						break;
					}
				}
				if (m == 0) {
					System.out.println("No contact with the given name exist");
				}
			}
		}

		void editPerson(String name, ArrayList<Contact> list) {
			if(list.size()==0){
				System.out.println("Addressbook is empty.Please add First");
			}
			else {
				int m = 0;
				for (int i = list.size() - 1; i >= 0; --i) {
					if (list.get(i).firstName.contains(name)) {
						list.get(i).addInfo();
						System.out.println("Contact Updated successfully");
						m += 1;
						break;
					}
				}
				if (m == 0) {
					System.out.println("No contact with the given name exist");
				}
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to Address Book Program ");
			UC5 addressbook = new UC5();
			Contact contact = new Contact();

			while (true) {
				System.out.println("Do you want to add/edit/delete the contact (0/1/2) :Press 3 to quit");
				int input = scan.nextInt();
				if (input == 0) {
					contact.addInfo();
					addressbook.addContact(contact);

				} else if (input == 1) {
					Scanner scan1=new Scanner(System.in);
					System.out.println("Enter the first name of person you to edit ");
					String name = scan1.nextLine();
					addressbook.editPerson(name, list);

				} else if (input == 2) {
					Scanner scan2=new Scanner(System.in);
					System.out.println("Enter the first name of the person you want to delete : ");
					String name = scan2.nextLine();
					addressbook.deletePerson(name, list);
				}

				else if (input == 3) {
					System.out.println("Program successfully closed");
					break;
				}

				else {
					System.out.println("Enter the valid command");
				}
			}

		}
}

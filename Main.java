package com.bridgelabz;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	Map<String, AddressBook> map = new HashMap();

	public static void main(String[] args) {

		AddressBook addressBook1 = new AddressBook();
		Main main = new Main();

		String addressBook1Name = "AddressBook1";
		Contact contact1 = new Contact("Nikhil", "Pawar", "Dhule","Maharashtra");
		Contact contact2 = new Contact("Aryan", "Patil", "Amalner","Gujrat");
		Contact contact3 = new Contact("Avi", "Patil", "Shirpur","Maharashtra");

		addressBook1.list.add(contact1);
		addressBook1.list.add(contact2);
		addressBook1.list.add(contact3);

		main.map.put(addressBook1Name, addressBook1);

		AddressBook addressBook2 = new AddressBook();
		String addressBook2Name = "AddressBook2";
		Contact contact4 = new Contact("Ravi", "Chaudhari", "Parola","Madhya Pradesh");
		Contact contact5 = new Contact("Amol", "Bagul", "Dhule","Andhra");
		Contact contact6 = new Contact("Abhishekh", "Patil", "Parola","Goa");
		addressBook2.list.add(contact4);
		addressBook2.list.add(contact5);
		addressBook2.list.add(contact6);
		main.map.put(addressBook2Name, addressBook2);

		List<Contact> list1 = (List<Contact>) addressBook1.list.stream().collect(Collectors.toList());
		List<Contact> list2 = (List<Contact>) addressBook2.list.stream().collect(Collectors.toList());
		list1.addAll(list2);
		
		//sorted by firstname
		List<Contact> sortedList1 = list1.stream()
		        .sorted(Comparator.comparing(Contact::getFirstName))
		        .collect(Collectors.toList());
		
		sortedList1.forEach(System.out::println);
		
		//sorted by city
		List<Contact> sortedList2 = list1.stream()
		        .sorted(Comparator.comparing(Contact::getCity))
		        .collect(Collectors.toList());
		
		sortedList2.forEach(System.out::println);
		
		//sorted by state
		List<Contact> sortedList3 = list1.stream()
		        .sorted(Comparator.comparing(Contact::getState))
		        .collect(Collectors.toList());
		
		sortedList3.forEach(System.out::println);

	
	}
	
}



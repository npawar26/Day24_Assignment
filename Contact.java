package com.bridgelabz;

public class Contact {

	String firstName, lastName, city, state ;

	public Contact(String firstName, String lastName, String city, String state) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
	}
	public Contact() {
		super();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Contact (firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", State=" + state + ")\n";
	}

}

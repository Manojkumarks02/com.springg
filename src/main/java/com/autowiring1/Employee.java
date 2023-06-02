package com.autowiring1;

public class Employee {
	private Address address;

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	public Employee() {
		super();
	}

	public Address getAddress() {
		return address;
	}

	public void setAdress(Address adress, Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employeee [adress=" + address + "]";
	}

}

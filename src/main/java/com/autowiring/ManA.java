package com.autowiring;

public class ManA {
	ManB manB;

	ManA() {
		System.out.println("A is going ");
	}

	public ManB getManB() {
		return manB;

	}

	public void setManB(ManB manB) {
		this.manB = manB;
	}

	void print() {
		System.out.println("hello A");
	}

	void display() {
		print();
		manB.print();

	}

}

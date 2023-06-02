package com.spring.model;

public class ConstructorInjection {

	private long id;
	private String name;

	public ConstructorInjection() {
		System.out.println(" constructor-1");
	}

	public ConstructorInjection(int id) {
		this.id = id;
		System.out.println(" constructor-2");

	}

	public ConstructorInjection(String name) {
		this.name = name;
		System.out.println(" constructor-3");
	}

	public ConstructorInjection(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(" constructor-4");
	}

	public void show() {
		System.out.println(id + " " + name);

	}

}

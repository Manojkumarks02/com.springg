package com.spring.model;

import org.springframework.core.env.CommandLinePropertySource;

public class CI2 {
	private long id;
	private String name;

	public CI2() {

	}

	public CI2(int id) {
		this.id = id;

	}

	public CI2(String name) {
		this.name = name;
	}

	public CI2(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public void show() {
		System.out.println(id);
		System.out.println(name);
	}

}

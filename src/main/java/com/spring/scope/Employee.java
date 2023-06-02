package com.spring.scope;

public class Employee {
	private String salary;

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public void test() {
		System.out.println(salary);
		
	}

}

package com.logilite.serialize.io;

import java.io.Serializable;

class Serialize implements Serializable {
	private static final long serialversionUID = 129348938L;
	transient int salary;
	static int experience;
	String name;
	int age;

	// Default constructor
	public Serialize(String name, int age, int salary, int experience) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.experience = experience;
	}

}

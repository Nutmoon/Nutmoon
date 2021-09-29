package com.logilite.nestedclass;

interface Detail {
	final static int AGE = 21;
	final static String NAME = "Darshan Devani";

	public abstract void getName();

	public abstract void getAge();
}

public class AnonymousDemo {

	public static void main(String[] args) {
		// Democlass is implementation class of Age interface
		DemoClass obj = new DemoClass();

		// calling getage() method implemented at Democlass
		System.out.println("Class Name Is :- "+obj.getClass().toString());
		obj.getAge();
		obj.getName();

	}
}

// Myclass implement the methods of Age Interface
class DemoClass implements Detail {
	@Override
	public void getName() {
		System.out.println("Name is " + NAME);
	}

	public void getAge() {
		System.out.println("Age is " + AGE);
	}
}

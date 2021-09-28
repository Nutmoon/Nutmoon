package com.logilite.generic;

public class Simple_Test1<T1, T2> {
//Create Object
	T1 obj1;
	T2 obj2;

	// constructor
	public Simple_Test1(T1 obj1, T2 obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	// method
	public void print() {
		System.out.println("\nObject IN string And Integer Value");
		System.out.println(obj1 + ", " + obj2);

	}

}

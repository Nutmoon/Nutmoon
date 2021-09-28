package com.logilite.generic;

public class Simple_Test<T> {
	// An object of type T is declared
	T obj;

	// constructor
	Simple_Test(T obj) {
		this.obj = obj;
	}

	public T getObject() {
		return this.obj;
	}

}

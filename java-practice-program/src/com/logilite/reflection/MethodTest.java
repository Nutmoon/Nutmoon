package com.logilite.reflection;

public class MethodTest {
	private String s = "Logilight";

	// create private method
	private void display() {
		System.out.println("\nRun Private Method from the Test class");
		System.out.println("Hello " + s);
	}

}

package com.logilite.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection_Testing {

	public static void main(String[] args) throws Exception {

		MethodTest t = new MethodTest();
		Class cl = Class.forName("com.logilite.reflection.MethodTest");
		
		// getclass method
		System.out.println("The name of class is " + cl.getName());

		// Getting the constructor Name
		Constructor constructor = cl.getConstructor();
		System.out.println("The name of constructor is " + constructor.getName());

		Method m = cl.getDeclaredMethod("display", null);

		// Use of Method class by using getMethods and print method name
		Method[] methods = cl.getMethods();
		System.out.println("\nWhich Methos  Run...");
		// print method name
		for (Method method : methods) {
			System.out.println(method.getName());
		}

		// object of the access specifier used with the field
		m.setAccessible(true);
		m.invoke(t, null);

	}

}
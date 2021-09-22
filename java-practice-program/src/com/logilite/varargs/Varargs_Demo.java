package com.logilite.varargs;

public class Varargs_Demo {

	private static void varargsmethod(boolean b, String name, String surname) {
		System.out.println("varargs method 1 : - " + b + name + surname);

	}

	public static void varargsmethod(boolean b, String... list) {
		System.out.println("varargs method 2 : - " + b + " list");

	}

	public static void varargsmethod(boolean b, int i, int j, int k, int l) {
		System.out.println("varargs method 3 : - " + b + i + j + k + l);

	}

	public static void main(String[] args) {
		varargsmethod(true, "Darshan", "Devani");
		varargsmethod(true, "My", "Name", "Is", "Darshan", "Devani");
		varargsmethod(true);
		varargsmethod(true, 1, 2, 3, 4);
	}

}

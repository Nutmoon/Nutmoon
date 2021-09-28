package com.logilite.generic;

public class Simple_Generic {
	public static void main(String[] args) {
		// instance of Integer type
		Simple_Test<Integer> iObj = new Simple_Test<Integer>(15);
		System.out.print("Integer value:- " + iObj.getObject());

		// instance of String type
		Simple_Test<String> sObj = new Simple_Test<String>("Darshan Devani");
		System.out.println("  String Value:-" + sObj.getObject());

		// Instance of String And Integer pair
		Simple_Test1<String, Integer> obj = new Simple_Test1<String, Integer>("Hardik Devani", 10);
		obj.print();
	}
}

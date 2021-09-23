package com.logilite.string;

public class StringMethods {

	public static void main(String[] args) {
		System.out.println("\n stringExamples ...");
		String s = "Logilite Technology!";
		System.out.println("s: " + s);

		System.out.println("\ns.length(): " + s.length());
		System.out.println("s.isEmpty(): " + s.isEmpty());

		// Comparison
		System.out.println("\n .equal method : " + s.equals("Logilite Technology!"));
		System.out.println(".equalsIgnoreCase method: " + s.equalsIgnoreCase("Logilite Technology!"));
		System.out.println(".compareTo method: " + s.compareTo("LOGILITE TECHNOLOGY!"));

		// Searching
		System.out.println("\n.contains method : " + s.contains("Technology"));
		System.out.println(".contains method : " + s.contains(" Technology!"));
		System.out.println(".startsWith method : " + s.startsWith("Logilite"));
		System.out.println(".startsWith method : " + s.startsWith("L"));
		System.out.println(".endsWith method : " + s.endsWith("!"));
		System.out.println(".indexOf method: " + s.indexOf("!"));
		System.out.println(".indexOf  method : " + s.indexOf('t'));
		System.out.println(".lastIndexOf method: " + s.lastIndexOf('T'));

		// Examining individual characters
		System.out.println("\n .charAt method : " + s.charAt(4));

		// Extracting substrings
		System.out.println("\n .substring method: " + s.substring(4));
		System.out.println(".substring method(a,b): " + s.substring(4, 9));

		// Case conversions
		System.out.println("\n .toUpperCase method : " + s.toUpperCase());
		System.out.println(" .toLowerCase method : " + s.toLowerCase());
		
		// returns a copy of string after trimming any leading & trailing white spaces
		System.out.println("\n .trim method : " + s.trim());

		// Replace
		System.out.println("\n .replaceAll method : " + s.replaceAll("o", "@"));

		// Split
		System.out.println("\n .split method : ");
		String[] sa = s.split("l");
		for (String temp : sa) {
			System.out.println(temp);
		}

	}

}

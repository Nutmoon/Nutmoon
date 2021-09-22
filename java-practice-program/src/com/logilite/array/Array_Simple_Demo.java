package com.logilite.array;

public class Array_Simple_Demo {

	public static void displayCity() {

	}

	public static void showNumber() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		String[] citys = { "Surat", "Ahemdabad", "Bangalore", "Pune", "Delhi" };
		int[] populations = new int[] { 77, 80, 123, 68, 300 };

		int i = 0;
		while (i < citys.length) {
			String name = citys[i];
			System.out.println("City " + (i + 1) + " :- " + name);
			i++;
		}
		System.out.println("\n");
		for (int j = 0; j < populations.length; j++) {
			int num = populations[j];
			System.out.println("Population " + (j + 1) + " :- " + num+" lakhs");
		}
	}

}

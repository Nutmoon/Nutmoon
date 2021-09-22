package com.logilite.array;

public class Array_Simple_Demo {

	public static void displayCity() {

	}

	public static void showNumber() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		String[] city = { "Surat", "Ahemdabad", "Bangalore", "Pune", "Delhi" };
		int[] number = new int[] { 100, 60, 80, 55, 93 };

		int i = 0;
		while (i < city.length) {
			String name = city[i];
			System.out.println("City " + (i + 1) + " :- " + name);
			i++;
		}
		System.out.println("\n");
		for (int j = 0; j < number.length; j++) {
			int num = number[j];
			System.out.println("Number " + (j + 1) + " :- " + num);
		}
	}

}

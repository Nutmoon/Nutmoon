package com.logilite.inheritance;

import java.util.Scanner;

public class Wages extends Typist {
	private String wages;

	public void getWages() {
		getTypist();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Daily Wages : ");
		wages = sc.nextLine();
	}

	public void displayWages() {
		displayTypist();
		System.out.println("WAGES :  " + wages);
	}
}

package com.logilite.inheritance;

import java.util.Scanner;

public class Officer extends Staff {
	private String grade;

	void getOfficer() {
		getStaff();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Grade : ");
		grade = sc.nextLine();
	}

	public void displayOfficer() {
		displayStaff();
		System.out.println("GRADE :  " + grade);
	}

}

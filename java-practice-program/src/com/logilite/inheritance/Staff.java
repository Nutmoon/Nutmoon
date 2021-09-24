package com.logilite.inheritance;

import java.util.Scanner;

public class Staff {
	private String code, name;

	public void getStaff() {

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter ID : ");
		code = sc.nextLine();
		System.out.print("Enter Name : ");
		name = sc.nextLine();

	}

	public void displayStaff() {
		System.out.println("\nID  :  " + code);
		System.out.println("NAME  :  " + name);
	}

}
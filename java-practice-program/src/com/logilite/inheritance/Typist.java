package com.logilite.inheritance;

import java.util.Scanner;

public class Typist extends Staff {
	private String speed;

	public void getTypist() {
		getStaff();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Speed : ");
		speed = sc.nextLine();
	}

	public void displayTypist() {
		displayStaff();
		System.out.println("SPEED :  " + speed);
	}

}
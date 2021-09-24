package com.logilite.inheritance;

import java.util.Scanner;

public class Teacher extends Staff {
	private String subject;

	public void getTeacher() {
		getStaff();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Subject : ");
		subject = sc.nextLine();
	}

	public void displayTeacher() {
		displayStaff();
		System.out.println("SUBJECT :  " + subject);
		
	}

}
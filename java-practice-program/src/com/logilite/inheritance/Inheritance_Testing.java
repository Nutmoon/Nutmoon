package com.logilite.inheritance;

import java.util.Scanner;

public class Inheritance_Testing {

	public static void main(String[] args) {
		int choice = 1;
		while (choice != 0) {
			System.out.println("\n\t\t\t.............Welcome to Logilite..........");
			System.out.println("1) Teacher Details..");
			System.out.println("2) Typist Details.. ");
			System.out.println("3) Officer Details..");
			System.out.println("Press 0  for exit.. ");
			System.out.print("\nEnter your choice :  ");

			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			if (choice == 0) {
				System.out.println("\n\n.................Thanks for Visiting....................\n");
				System.exit(1);
			}

			switch (choice) {
			case 1:
				System.out.println("\n........TEACHER DETAILS........");
				System.out.println("\n..Inputing Data..");
				Teacher obj_teacher = new Teacher();
				obj_teacher.getTeacher();
				System.out.println("\n..Displaying Data..\n");
				obj_teacher.displayTeacher();
				break;
			case 2:
				System.out.println("\n........TYPIST DETAILS........\n");
				System.out.println("\n..Inputing Data..\n");
				Wages obj_wage = new Wages();
				obj_wage.getWages();
				System.out.println("\n..Displaying Data..\n");
				obj_wage.displayWages();
				break;
			case 3:
				System.out.println("\n........OFFICER DETAILS........\n");
				System.out.println("\n..Inputing Data..\n");
				Officer obj_officer = new Officer();
				obj_officer.getOfficer();
				System.out.println("\n..Displaying Data..\n");
				obj_officer.displayOfficer();
				break;
			}

		}
	}
}

package com.logilite.classandobjects;

public class StudentTest {
	public static void main(String[] args) {

		Student s = new Student();

		s.id = 1111;
		s.name = "Darshan";
		s.gender = "male";
		System.out.println("....Old Infrmation....");
		System.out.println("Old Id : - " + s.id);
		System.out.println("Old Name : - " + s.name);
		System.out.println("Old Gender : - " + s.gender);

		s.updateProfile(1000, "Darshan Devani", "male");
		s.addInformation(8000, "javaTrainee");
		s.display();
		s.fullProfile();

	}
}

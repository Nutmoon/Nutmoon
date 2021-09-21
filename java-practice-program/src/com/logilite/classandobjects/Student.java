package com.logilite.classandobjects;

public class Student {
	int id;
	int salary;
	String post;
	String name;
	String gender;

	public void updateProfile(int newId, String newName, String newGender) {
		id = newId;
		name = newName;
		gender = newGender;

	}

	public void addInformation(int newSalary, String newPost) {
		salary = newSalary;
		post = newPost;

	}

	public void display() {
		System.out.println("\n....Only Essential Information....");
		System.out.println("New Id :- " + id);
		System.out.println("New Name :- " + name);
		System.out.println("New Gender :- " + gender);
	}

	public void fullProfile() {
		System.out.println("\n....Your full profile......");
		System.out.println(" Id :- " + id);
		System.out.println(" Name :- " + name);
		System.out.println(" Post :-" + post);
		System.out.println(" Gender :- " + gender);
		System.out.println(" Salary :-" + salary);

	}

}

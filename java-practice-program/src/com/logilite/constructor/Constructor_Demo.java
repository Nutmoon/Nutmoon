package com.logilite.constructor;

import com.logilite.variable.VariableTest;

public class Constructor_Demo {

	static int countEmployee;
	static int count;
	int emp_Id;
	String name;
	String gender;
	String post = "Fresher";
	int age;
	long phone_No;
	int experience;
	boolean senior;
	double salary = 8000;
	double bonusSalary = 5000;
	double experienceSalary = 10000;

	public Constructor_Demo(int emp_Id, String name, String gender, int age, long phone_No, int experience) {

		this(emp_Id, name, gender, age, phone_No, experience, false);

	}

	public Constructor_Demo(int emp_Id, String name, String gender, int age, long phone_No, int experience,
			Boolean senior) {
		// use of this reference
		this.emp_Id = emp_Id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone_No = phone_No;
		this.experience = experience;
		this.senior = senior;

		int next_Emp_Id = emp_Id + 1;
		countEmployee = countEmployee + 1;
		count++;

		if (senior) {
			salary = salary + bonusSalary;
			post = "Senior";
		}

		if (experience > 5) {
			salary = salary + experienceSalary;
		}

		System.out.println("\n\nEmployee Id : - " + emp_Id);
		System.out.println("Employee Name :- " + name.toUpperCase());
		System.out.println("Employee Gender :- " + gender);
		System.out.println("Employee Age :- " + age);
		System.out.println("Employee Contect No :- " + phone_No);
		System.out.println("Employee Experience(year) :- " + experience);
		System.out.println("Employee Salary :- " + salary);
		System.out.println("Emplooyee Post :-" + post);
		System.out.println("Next Employee ID :- " + next_Emp_Id);

	}

	public Constructor_Demo() {
		System.out.println("\nDefault null Constructor Run...");
	}

	boolean updateName(String newName) {
		this.name = newName;
		return true;

	}

	public static void main(String[] args) {
		Constructor_Demo con_1 = new Constructor_Demo(1001, "Darshan Devani", "male", 21, 8855223314l, 1);
		Constructor_Demo con_2 = new Constructor_Demo(1002, "Hardik Devani", "male", 28, 9955223352l, 6, true);
		Constructor_Demo con_3 = new Constructor_Demo(1003, "paula nickolds", "female", 48, 9236584963l, 12, true);
		Constructor_Demo con_4 = new Constructor_Demo();

		System.out.println("\n Name Of Employee1 : -" + con_1.name);
		System.out.println("\n Name Of Employee2 : -" + con_2.name);
		System.out.println("\n Name Of Employee3 : -" + con_3.name);

		con_1.updateName("Darshan D. Devani");
		System.out.println("\n Updated Name :- " + con_1.name);
		System.out.println("\nHowmany Employees See in list :- " + Constructor_Demo.countEmployee);
		System.out.println("\nHowmany Time Constructor run  :- " + Constructor_Demo.countEmployee);
	}

}

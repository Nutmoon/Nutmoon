package com.logilite.variable;

public class VariableTest {

	static int countEmployee;
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

	public void display() {
		int next_Emp_Id = emp_Id + 1;
		countEmployee = countEmployee + 1;

		if (senior) {
			salary = salary + bonusSalary;
			post = "Senior";
		}

		System.out.println("\n\nEmployee Id : - " + emp_Id);
		System.out.println("Employee Name :- " + name);
		System.out.println("Employee Gender :- " + gender);
		System.out.println("Employee Age :- " + age);
		System.out.println("Employee Contect No :- " + phone_No);
		System.out.println("Employee Experience(year) :- " + experience);
		System.out.println("Employee Salary :- " + salary);
		System.out.println("Emplooyee Post :-" + post);
		System.out.println("Next Employee ID :- " + next_Emp_Id);

	}

	public static void main(String[] args) {
		VariableTest var_1 = new VariableTest();
		VariableTest var_2 = new VariableTest();
		VariableTest var_3 = new VariableTest();
		var_1.emp_Id = 1001;
		var_1.name = "Darshan Devani";
		var_1.gender = "male";
		var_1.age = 21;
		var_1.phone_No = 8855223314l;
		var_1.experience = 1;
		var_1.senior = false;
		var_1.display();

		var_2.emp_Id = 1002;
		var_2.name = "Hardik Devani";
		var_2.gender = "male";
		var_2.age = 28;
		var_2.phone_No = 9955223352l;
		var_2.experience = 6;
		var_2.senior = true;
		var_2.display();

		var_3.emp_Id = 1003;
		var_3.name = "paula nickolds";
		var_3.gender = "female";
		var_3.age = 48;
		var_3.phone_No = 9236584963l;
		var_3.experience = 12;
		var_3.senior = true;
		var_3.display();

		System.out.println("\nHowmany Employees See in list :- " + VariableTest.countEmployee);

	}

}

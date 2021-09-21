package com.logilite.variable_kinds;

class Stud {
	static int count = 0;// instance variable
	int id;
	String name;
	String gender;

	boolean update(String newName, int nId, String nGender) {
		this.name = newName;
		this.id = nId;
		this.gender = nGender;

		return true;
	}

	void print() {
		count = count + 1; // local variable
		System.out.println("\nId :" + id + "\nName : " + name + "\nGender : " + gender + " \nCount : " + count);
	}
}

public class Variables {
	public static void main(String[] args) {

		Stud s = new Stud();
		s.id = 1;
		s.name = "Ravi";
		s.gender = "Male";

		s.update(s.name, s.id, s.gender);
		s.print();

		Stud s1 = new Stud();
		s1.id = 2;
		s1.name = "Jayesh";
		s1.gender = "Male";

		s1.update(s1.name, s1.id, s1.gender);
		s1.print();
		
		Stud s2 = new Stud();
		s1.id = 2;
		s1.name = "Jayesh";
		s1.gender = "Male";

		s1.update(s1.name, s1.id, s1.gender);
		s1.print();
		
	}
}

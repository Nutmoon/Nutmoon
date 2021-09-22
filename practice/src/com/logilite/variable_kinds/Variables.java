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

		Stud s2 = new Stud();
		s2.id = 2;
		s2.name = "Jayesh";
		s2.gender = "Male";
        
		s2.update(s2.name, s2.id, s2.gender);
		s2.print();
		
		Stud s3 = new Stud();
		s3.id = 3;
		s3.name = "Ankit";
		s3.gender = "Male";

		s3.update(s3.name, s3.id, s3.gender);
		s3.print();
		
	}
}

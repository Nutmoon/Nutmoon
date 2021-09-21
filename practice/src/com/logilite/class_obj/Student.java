package com.logilite.class_obj;

class Stud{
	int id =2;
	String name= "cdf";
	String gender = "Female";
	
	boolean update(String newName,int nId , String nGender) {
		this.name= newName;
		this.id = nId;
		this.gender = nGender;
		return true;
	}
	void print() {
		System.out.println("Id :" + id + "\nName : " + name + "\nGender : "+ gender);
	}
}

public class Student {
public static void main(String[] args) {
	Stud s = new Stud();
	s.name = "abc";
	s.id = 1;
	s.gender = "Male";
	
	s.update(s.name,s.id,s.gender);
	s.print();
}
}

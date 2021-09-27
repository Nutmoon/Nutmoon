package com.logilite.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

class Book {
	int id;
	String name, Company, post;
	float experience;

	public Book(int id, String name, String Company, String post, float experience) {
		this.id = id;
		this.name = name;
		this.Company = Company;
		this.post = post;
		this.experience = experience;
	}
}

public class ArrayList_testing {
	public static void main(String[] args) {
		// Creating list of Books
		List<Book> list = new ArrayList<Book>();
		// Creating Books
		Book b1 = new Book(101, "Darshan_Devani", "Logilight", "Fresher", 1);
		Book b2 = new Book(102, "Hardik_Devani", "Logilight", "Senior", 6);
		Book b3 = new Book(103, "Niraj-Mangukiya", "Logilight", "Fresher", 1);
		Book b4 = new Book(104, "Tarun_Lathiya", "Nth Way", "Fresher", 1);
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		// Show list
		for (Book b : list) {
			System.out.println(b.id + " " + b.name + " " + b.Company + " " + b.post + " " + b.experience);
		}
		list.remove(b4);
		// Show list after Remove
		System.out.println("\nAfetr Removing 4 memeber...\n");
		for (Book b : list) {
			System.out.println(b.id + " " + b.name + " " + b.Company + " " + b.post + " " + b.experience);
		}

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);
		list2.add(11);
		list2.add(51);
		list2.add(1);
		Collections.sort(list2);
		// Show list after Remove
		System.out.println("\nAfetr Sorting...\n");
		for (Integer a : list2) {
			System.out.println(a);
		}
		// Print in reverse order

		ListIterator<Integer> number = list2.listIterator(list2.size());
		System.out.println("\n Afetr Iterator In reverse order...\n");
		while (number.hasPrevious()) {
			Integer str = number.previous();
			System.out.println(str);
		}
	}
}

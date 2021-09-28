package com.logilite.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Set {

	private static void hashSetDemo() {
		HashSet<String> set1 = new HashSet<>();
		set1.add("Darshan");
		set1.add("Devani");
		set1.add("Darshan");

		System.out.println("set1: " + set1);

		Book book1 = new Book("Java", "Logilite", 2013);
		Book book2 = new Book("New India", "Narendra Modi", 2014);
		HashSet<Book> set2 = new HashSet<>();
		set2.add(book1);
		set2.add(book2);
		System.out.println("set2: " + set2);
	}

	public static void linkedHashSetDemo() {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Darshan");
		hashSet.add("Hardik");
		hashSet.add("Amit");
		hashSet.add("Prakash");
		System.out.println("hashSet: " + hashSet);

		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Darshan");
		linkedHashSet.add("Amit");
		linkedHashSet.add("Hardik");
		linkedHashSet.add("Prakash");
		System.out.println("linkedHashSet: " + linkedHashSet);
	}

	public static void main(String[] args) {
		hashSetDemo();
		linkedHashSetDemo();
	}
}

class Book {
	private String title;
	private String author;
	private int year;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Book(String title, String author, int year) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, title, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title) && year == other.year;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
	}

}

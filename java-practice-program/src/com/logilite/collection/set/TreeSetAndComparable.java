package com.logilite.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetAndComparable {
	private static void treeSetDemo() {
		Company book1 = new Company("Oracal", "Haresh Moradiya", 1997);
		Company book2 = new Company("Wipro", "Amit Patel", 1997);
		Company book3 = new Company("Logilite", "Hardik Devani", 1854);
		Company book4 = new Company("TCS", "Dipak Patel", 2008);

		TreeSet<Company> books = new TreeSet<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);

		for (Company book : books) {
			System.out.println(book);
		}
	}

	public static void main(String[] args) {
		treeSetDemo();
	}

}

class Company implements Comparable {
	private String comapanyName;
	private String empName;
	private int year;

	public String getComapanyName() {
		return comapanyName;
	}

	public void setComapanyName(String comapanyName) {
		this.comapanyName = comapanyName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Company(String comapanyName, String empName, int year) {
		super();
		this.comapanyName = comapanyName;
		this.empName = empName;
		this.year = year;
	}

	
	@Override
	public String toString() {
		return "Company [CName=" + comapanyName + ", EName=" + empName + ", Year=" + year + "]";
	}

	

	public int compareTo(Object book) {
		return getComapanyName().compareTo(((Company) book).getComapanyName()); // utilizing String’s compareTo
	}

}

/*class TitleComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Company) o1).getComapanyName().compareTo(((Company) o2).getComapanyName());
	}*/



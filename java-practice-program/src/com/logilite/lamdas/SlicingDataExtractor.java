package com.logilite.lamdas;

import java.util.Arrays;
import java.util.List;

import com.logilite.lamdas.SlicingStreamTesting.Book;

public class SlicingDataExtractor {

	static List<Book> getFromIT(String keyword) {
		Book b1 = new Book(9780596009201L, "Logilite", 4.9, 25.0, "IT Field");
		Book b2 = new Book(9780596009202L, "Oracal", 4.1, 25.0, "IT Field");
		Book b3 = new Book(9780596009203L, "Infosys", 4.5, 25.0, "IT Field");
		Book b4 = new Book(9780596009204L, "TCS", 4.5, 25.0, "IT Field");
		Book b5 = new Book(9780596009205L, "Wipro", 3.9, 30.0, "IT Field");
		Book b6 = new Book(9780596009206L, "Event manager", 4.8, 40.0, "IT Field");
		Book b7 = new Book(9780596009207L, "HCL", 4.9, 40.0, "IT Field");
		Book b8 = new Book(9780596009208L, "L & T", 4.7, 50.0, "IT Field");

		return Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b7, b8);
	}

	static List<Book> getFromConstruction(String keyword) {
		Book b1 = new Book(9780596009201L, "TCS", 3.9, 20.0, "Constuction Field");
		Book b2 = new Book(9780596009202L, "Java 2", 4.1, 20.0, "Constuction Field");
		Book b3 = new Book(9780596009203L, "L & T 3", 4.6, 20.0, "Constuction Field");
		Book b4 = new Book(9780596009204L, "HCL", 4.5, 20.0, "Constuction Field");
		Book b5 = new Book(9780596009211L, "Hindustan con..", 4.9, 40.0, "Constuction Field");
		Book b6 = new Book(9780596009212L, "GMR infrastructure", 4.9, 55.0, "Constuction Field");
		Book b7 = new Book(9780596009213L, "Macro tech", 4.9, 60.0, "Constuction Field");

		return Arrays.asList(b1, b2, b3, b4, b5, b6, b7);
	}
}

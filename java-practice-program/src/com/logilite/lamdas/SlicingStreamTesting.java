package com.logilite.lamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SlicingStreamTesting {

	// class Book
	static class Book {
		private long isbn;
		private String title;
		private double rating;
		private double price;
		private String source;

		// book class constructor
		public Book(long isbn, String title, double rating, double price, String source) {
			this.isbn = isbn;
			this.title = title;
			this.rating = rating;
			this.price = price;
			this.source = source;
		}

		// getter setter method
		public long getIsbn() {
			return isbn;
		}

		public String getTitle() {
			return title;
		}

		public double getRating() {
			return rating;
		}

		public double getPrice() {
			return price;
		}

		public String getSource() {
			return source;
		}

		// has code for only show unique data
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (isbn ^ (isbn >>> 32));
			return result;
		}

		// Equals method compare data
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			if (isbn != other.isbn)
				return false;
			return true;
		}

		// show in string data
		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", title=" + title + ", rating=" + rating + ", price=" + price + ", source="
					+ source + "]";
		}

	}

	// Print at most 5 DISTINCT books with rating >= 4.5
	//use of slicing stream class
	private static void slice(List<Book> books) {
		System.out.println("\nSlice ...\n ");

		// Show top 5 company his rating more than 4.5
		// DB world: select distinct (ISBN) from book where rating >= 4.5 limit 0, 5;
		Stream<Book> booksStream = books.stream().filter(d -> d.getRating() >= 3.0).distinct();
		// .peek(d -> System.out.println(d.getTitle() + " " + d.getRating()));

		Stream<String> titleStream = booksStream.map(d -> d.getTitle());
		titleStream.forEach(System.out::println);
	}

	// Main class start to here
	public static void main(String[] args) {

		List<Book> books = new ArrayList<>();

		books.addAll(SlicingDataExtractor.getFromIT("Languages"));
		books.addAll(SlicingDataExtractor.getFromConstruction("Buildings"));

		slice(books);
	}

}

package com.logilite.nestedclass;

import java.io.StringWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.StaxDriver;

//Demo Of Local Class
public class LocalClassDemo {
	// Convert Data In to Xml Form
	public static String getBookAsXml(int id, String title, double rating, int fbLikesCount, int tweetCount) {

		class Book {
			private int id;
			private String title;
			private double rating;
			private int fbLikesCount;
			private int tweetCount;

			//constructor Book class
			public Book(int id, String title, double rating, int fbLikesCount, int tweetCount) {
				this.id = id;
				this.title = title;
				this.rating = rating;
				this.fbLikesCount = fbLikesCount;
				this.tweetCount = tweetCount;
			}
		}

		Book book = new Book(id, title, rating, fbLikesCount, tweetCount);

		// xml class From the jar
		XStream xstream = new XStream(new StaxDriver());
		xstream.alias("book", Book.class);
		StringWriter writer = new StringWriter();
		xstream.marshal(book, new PrettyPrintWriter(writer));

		return writer.toString();
		// return xstream.toXML(book);
	}

	public static void main(String[] args) {
		//call xml class to covert data
		System.out.println(LocalClassDemo.getBookAsXml(1111, "Logilight", 5.0, 5, 6));
	}
}

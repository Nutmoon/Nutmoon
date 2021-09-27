package com.logilite.serialize.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeAndDeserialize {
	public static void printdata(Serialize object1) {

		System.out.println("name = " + object1.name);
		System.out.println("age = " + object1.age);
		System.out.println("salary = " + object1.salary);
		System.out.println("experience = " + object1.experience);
	}

	public static void main(String[] args) {
		Serialize object = new Serialize("Darshan Devani", 21, 8000, 1);
		String filename = "F:\\eclipse program\\demo.txt";

		// Serialization
		try {

			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Object has been serialized\n" + "Data before Deserialization.");
			printdata(object);

			// value of static variable changed
			object.experience = 5;
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		object = null;

		// Deserialization
		try {

			// Reading the object from the file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			object = (Serialize) in.readObject();

			in.close();
			file.close();
			System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
			printdata(object);

		}

		catch (IOException ex) {
			System.out.println("IOException Error....");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException Error...");
		}
	}
}
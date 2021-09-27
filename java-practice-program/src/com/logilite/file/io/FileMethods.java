package com.logilite.file.io;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FileMethods {
	public static void fileMethodsDemo() {
		System.out.println("\nInside fileMethodsDemo ...");

		File f = new File("F:\\eclipse program\\demo.txt");
		// File f = new File("demo.txt");

		System.out.println("getAbsolutePath(): " + f.getAbsolutePath());
		try {
			System.out.println("getCanonicalPath(): " + f.getCanonicalPath());
			System.out.println("createNewFile(): " + f.createNewFile());
		} catch (IOException e) {
		}
		System.out.println("separator: " + f.separator);
		System.out.println("separatorChar: " + f.separatorChar);
		System.out.println("getParent(): " + f.getParent());
		System.out.println("lastModified() Year: " + TimeUnit.MILLISECONDS.toDays(f.lastModified()/365));
		System.out.println("exists(): " + f.exists());
		System.out.println("isFile(): " + f.isFile());
		System.out.println("isDirectory(): " + f.isDirectory());
		System.out.println("length(): " + f.length());

		System.out.println("My working or user directory: " + System.getProperty("user.dir"));

	}

	public static void main(String[] args) {
		
		fileMethodsDemo();

	}

}

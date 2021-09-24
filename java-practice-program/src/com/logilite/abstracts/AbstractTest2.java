package com.logilite.abstracts;

public class AbstractTest2 {

	public static void show(Phone_Specification obj) {
		obj.showConfig();
	}

	public static void main(String[] args) {

		Iphone ip = new Iphone();
		Samsung ss = new Samsung();
		show(ip);
		show(ss);
	}

}

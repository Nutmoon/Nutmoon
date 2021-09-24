package com.logilite.variable;

public class Static_Demo {
	private static String str = "My Name Is Darshan..";
	private static int privatevalue = 111;
	static int staticvalue = 202;
	final int balance;

	public Static_Demo() { // constuctor
		balance = 1111;
		System.out.println("Final varible call " + balance);

	}

	static int sum(int a, int b) { // static method
		int c = a + b;
		return c;
	}

	static { // static block
		System.out.println("IT'S STATIC BLOCK>>>>....Runnning...........");
	}

	private static void privatefun() { // private function
		System.out.println("Private function running inside class...");
	}

	static class Nestedclass { // static classs
		static void eat() {
			System.out.println("Nested static class...");
		}

		public void display() { // non static function and inside static variable& method only
			System.out.println("Run Static class..");
			System.out.println(str);
			System.out.println("Static class sum = " + sum(20, 30));
			// System.out.println(a); //its give error because it not static variable

		}

	}

	public static void main(String[] args) {
		Static_Demo.Nestedclass sc = new Static_Demo.Nestedclass();
		sc.display();
		sc.eat();
		System.out.println("First Intialized vale " + staticvalue); // static variable call
		staticvalue = 10003; // static value update
		System.out.println("Updateed static value " + staticvalue);

	}
}

package com.logilite.variable;

public class Final_Demo extends Final_SubClass {
		final int balance;
		final static int age =21;

		public Final_Demo() {
			balance = 5000;
		}

		final void demo() {
			System.out.println("Run Final demo method ... ");
			System.out.println(" final method inherits but not ovverride ");
			System.out.println("final class value " + balance);
		}

		public static void main(String[] args) {
			Final_Demo fc = new Final_Demo();
			fc.demo();
			System.out.println("Age = "+ age);

		}

	}



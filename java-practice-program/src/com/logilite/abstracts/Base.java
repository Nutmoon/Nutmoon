package com.logilite.abstracts;

public abstract class Base {
	final int a = 10;
	final int value;
	static int b = 50;

	abstract void show();

	public Base() {
		System.out.println("Abstract class in also declare Constructor method . . .");
		value = 11;
	}

	public void display() {
		System.out.println("Abstract class in also declare non abstract method  & public modifier . . .");
	}
	
	protected void priview() {
		System.out.println("I am in Abstract class and protected modifier ");
	}

	static void myMethod() {
		System.out.println("I am in Abstract class and static method and value is " + b);
	}

	final void doparty() {
		System.out.println("I am in Abstract class and final method and value is " + a + " After intialize " + value);
	}
	static {
		System.out.println("Hello you are in static block....");
	}
}

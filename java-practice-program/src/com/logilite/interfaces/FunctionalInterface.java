package com.logilite.interfaces;

interface Policy {
	default void policies() {
		System.out.println("Customer happiness and privacy is our priority");
	}
}

interface Sayable extends Policy {
	void say(String msg); // abstract method
}

public class FunctionalInterface implements Sayable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterface fi = new FunctionalInterface();
		fi.say("Hello You are in compuer Shop");
		fi.policies();
	}
}
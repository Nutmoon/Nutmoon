package com.logilite.thread;

public class TransactionProcess {
	int amount = 2000;

	// create synchronized method for withdraw
	synchronized void withdraw(int amount) throws InterruptedException {
		System.out.println("Withdraw under proccessing..");

		if (this.amount < amount) {
			System.out.println("Your account in not enough balance.. plz deposite money...");
		}
		wait(); // while money deposite processing that time wait() use

		if (this.amount > amount) {
			this.amount -= amount;
			System.out.println("Withdraw sucessfully....");
		} else
			System.out.println("Sorry still not enough balance..");

	}

	// create synchronized method for deposite
	synchronized void deposite(int amount) throws InterruptedException {
		System.out.println("Deposite under proccessing..");

		wait(4000); // while money deposite processing that time wait() use
		this.amount += amount;

		System.out.println("Deposite sucessfully...");

		notify();  //deposite sucessfully so notify to wait thread
	}
}

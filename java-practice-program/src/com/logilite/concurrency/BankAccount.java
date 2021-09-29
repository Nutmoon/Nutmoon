package com.logilite.concurrency;

//Create Class Bank Account And Implement By Runnable InterFace
public class BankAccount implements Runnable {
	private int balance;

	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	//run method Run first after Starting
	public void run() {
		makeWithdrawal(750);
		if (balance < 0) {
			System.out.println("Your Account in not Sufficient Balance!!!");
		}
	}
	//Withdraw Method but Not working properly because of Race Condition
	private synchronized void makeWithdrawal(int amount) {
		if (balance >= amount) {
			//Give Thread Name 
			System.out.println(Thread.currentThread().getName() + " is about to withdraw ...");
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount + " Dollar");
		} else {
			System.out.println("Sorry, not enough balance for " + Thread.currentThread().getName());
		}
	}

}
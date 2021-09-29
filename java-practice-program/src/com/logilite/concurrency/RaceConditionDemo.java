package com.logilite.concurrency;

public class RaceConditionDemo {
	public static void main(String[] args) {
		
		//Declare class And Create task object
		BankAccount task = new BankAccount();
		task.setBalance(1000);

		//Create Thread Of Darshan Hardik
		Thread darshan = new Thread(task);
		Thread hardik = new Thread(task);
		
		///Give Priority of the thread
		darshan.setPriority(Thread.MAX_PRIORITY);
		hardik.setPriority(Thread.MIN_PRIORITY);
		
		//Set Naming Of Thread 
		darshan.setName("Darshan");
		hardik.setName("Hardik");
		
		//Satrting Thread
		darshan.start();
		hardik.start();
	}
}




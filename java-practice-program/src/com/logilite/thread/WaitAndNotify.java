package com.logilite.thread;

public class WaitAndNotify {
	public static void main(String[] args) throws InterruptedException {
		// TransactionProcess class object Create
		TransactionProcess it = new TransactionProcess();
		// create thread t1
		Thread t1 = new Thread() {

			public void run() { // run method And Withdraw
				try {
					it.withdraw(2500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};

		t1.start(); // Start thread t1 obj

		Thread t2 = new Thread() { // create thread t2

			public void run() { // run method And Deposit
				try {
					it.deposite(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		t2.start(); // Start thread t2 obj
		t1.join();  
		t2.join();
	}

}
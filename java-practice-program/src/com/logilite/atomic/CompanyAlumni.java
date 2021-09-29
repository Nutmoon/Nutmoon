package com.logilite.atomic;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CompanyAlumni {

	public static class Alumni {
		private String name;
		// atomic variable
		private AtomicInteger count = new AtomicInteger(1); // 1 for organizer

		// constructor of inner class
		public Alumni(String name) {
			this.name = name;
		}

		// attending method count how many attending
		public void attending(int guestCount) {
			if (guestCount == 1) {
				count.incrementAndGet(); //inbuild increase method in atomic
			} else {
				count.addAndGet(guestCount); //Add method inbuild
			}
		}

		// nonAttending method count how many not attending
		public void notAttending(int guestCount) {
			if (guestCount == 1) {
				count.decrementAndGet();  //inbuild decrese method in atomic
			} else {

				boolean updated = false;

				while (!updated) {
					int currentCount = count.get();
					int newCount = currentCount - guestCount;
					updated = count.compareAndSet(currentCount, newCount);  //comare method in build
				}
			}
		}

		// getCount method count total separately
		public int getCount() {
			return count.get();
		}
	}

	// main Method starting to here
	public static void main(String[] args) {
		Alumni logilite = new Alumni("LOgilite Is Excellency with Simplicity");

		// Thread class object user1 run method and tell how many attend or not
		Thread user1 = new Thread(new Runnable() {
			@Override
			public void run() {
				logilite.attending(5);
				System.out.println(Thread.currentThread().getName() + " : " + logilite.getCount());
			}
		});

		// Thread class object user2 run method and tell how many attend or not
		Thread user2 = new Thread(new Runnable() {
			@Override
			public void run() {
				logilite.attending(3);
				System.out.println(Thread.currentThread().getName() + " : " + logilite.getCount());
				logilite.notAttending(3);
				System.out.println(Thread.currentThread().getName() + " : " + logilite.getCount());
			}
		});
		
		// Thread class object user3 run method and tell how many attend or not
		Thread user3 = new Thread(new Runnable() {
			@Override
			public void run() {
				logilite.attending(1);
				System.out.println(Thread.currentThread().getName() + " : " + logilite.getCount());
			}
		});

		//set name of object of thread
		user1.setName("User 1");
		user2.setName("User 2");
		user3.setName("User 3");

		//starting object
		user1.start();
		sleep(1);   //Sleep 1second
		user2.start();
		sleep(2);
		user3.start();
		sleep(2);
		System.out.println("Total attending : " + logilite.getCount());
	}

	//create sleep method and declare sleep in second
	private static void sleep(int i) {
		try {
			TimeUnit.SECONDS.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

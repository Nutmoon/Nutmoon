package com.logilite.thread;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Producer_Demo {
	// Use of LinkedBlockingQueue for data consume
	private static LinkedBlockingQueue<Object> data = new LinkedBlockingQueue<Object>();

	public static void main(String[] args) {

		// Timer task for task
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				// collect data here and c
				ArrayList<Object> drainData = new ArrayList<Object>();
				synchronized (data) {
					data.drainTo(drainData); // drainto work drain all old data and store new data
				}
				// Display every 10 mili-second produce 1 data so 5 Second in produce 500 data
				// and fetch from the queue
				String timeStamp = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
				System.out.println(timeStamp + " > Collected data from queue: " + drainData.size());
			}
		};
		// timer for time to run task
		Timer timer = new Timer();

		// schedules the task to be run in an interval Every 5 second
		timer.schedule(task, new Date(0), 5000);

		// ScheduledExecutorService run 1 threadpool every 10 milisecond produce 1 data
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Producer(), 0, 10, TimeUnit.MILLISECONDS);

	}

	public static class Producer extends Thread {

		// run And produce random number
		public void run() {
			synchronized (data) {
				int val = new Random().nextInt(100);
				data.add(val);
			}
		}
	}
}

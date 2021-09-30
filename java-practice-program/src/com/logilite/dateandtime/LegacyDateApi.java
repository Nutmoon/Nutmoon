package com.logilite.dateandtime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LegacyDateApi {

	public void testLegacyDateAPI() {

		System.out.println("\nDate class ... ");
		Date currentDate = new Date(); // Date class using
		System.out.println("currentDate: " + currentDate);

		System.out.println("currentDate in ms: " + currentDate.getTime()); // using CurrentDate & Time

		System.out.println("\nCalendar class ... ");
		Calendar expiryDate = new GregorianCalendar(2021, 9, 30); // using GregorianCalendar class
		System.out.println("expiryDate: " + expiryDate); // give string
		System.out.println("expiryDate: " + expiryDate.getTime()); // Give get date And time

		expiryDate.add(Calendar.MONTH, 8); // add method In calander class
		System.out.println("new expiryDate: " + expiryDate.getTime());

		expiryDate.roll(Calendar.MONTH, 11); // roll method that add month within year
		System.out.println("new expiryDate (roll): " + expiryDate.getTime());

		// Calendar class And Set time zone
		Calendar gameStartTime = new GregorianCalendar(TimeZone.getTimeZone("Europe/London"));
		gameStartTime.set(2021, Calendar.JULY, 03, 9, 00); // Set Time
		System.out.println("gameStartTime.getTime: " + gameStartTime.getTime()); // show Time which set// Using get
																					// method to get time
		System.out.println("London time -- MONTH/DAY at hr:min:sec (AM/PM) -- "
				+ (gameStartTime.get(Calendar.MONTH) + 1) + "/" + gameStartTime.get(Calendar.DAY_OF_MONTH) + " at "
				+ gameStartTime.get(Calendar.HOUR) + ":" + gameStartTime.get(Calendar.MINUTE) + " ("
				+ ((gameStartTime.get(Calendar.AM_PM) == 0) ? "AM" : "PM") + ")");

		gameStartTime.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));// Using get method to get time
		System.out.println("Indian time -- MONTH/DAY at hr:min:sec (AM/PM) -- "
				+ (gameStartTime.get(Calendar.MONTH) + 1) + "/" + gameStartTime.get(Calendar.DAY_OF_MONTH) + " at "
				+ gameStartTime.get(Calendar.HOUR) + ":" + gameStartTime.get(Calendar.MINUTE) + " ("
				+ ((gameStartTime.get(Calendar.AM_PM) == 0) ? "AM" : "PM") + ")");

		gameStartTime.setTimeZone(TimeZone.getTimeZone("GMT-08:30"));
		System.out.println("Custome time -- MONTH/DAY at hr:min:sec (AM/PM) -- "
				+ (gameStartTime.get(Calendar.MONTH) + 1) + "/" + gameStartTime.get(Calendar.DAY_OF_MONTH) + " at "
				+ gameStartTime.get(Calendar.HOUR) + ":" + gameStartTime.get(Calendar.MINUTE) + " ("
				+ ((gameStartTime.get(Calendar.AM_PM) == 0) ? "AM" : "PM") + ")");

		// After/Before demonstration
		Calendar gameFinal = new GregorianCalendar(TimeZone.getTimeZone("Europe/London"));
		gameFinal.set(2021, Calendar.JULY, 16, 9, 00);
		System.out.println("After? " + gameStartTime.after(gameFinal));
		System.out.println("Before? " + gameStartTime.before(gameFinal));

		// Time Zone Demo
		System.out.println("\nTimeZones ... /n");
		String[] timeZones = TimeZone.getAvailableIDs();

		for (String timeZone : timeZones) {
			System.out.println(timeZone);
		}

	}
}

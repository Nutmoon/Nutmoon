package com.logilite.dateandtime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateAndTimeDemo {

	public static void main(String[] args) {
		LegacyDateApi time = new LegacyDateApi();
		time.testLegacyDateAPI();
		DateAndTimeApi latest = new DateAndTimeApi();
		latest.testDateTimeAPI();
	}

}
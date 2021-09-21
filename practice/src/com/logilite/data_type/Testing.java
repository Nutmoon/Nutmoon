package com.logilite.data_type;

import java.math.BigDecimal;

/*testing range of Primitive data type*/

public class Testing {
	public static void main(String[] args) {
		byte num1 = 123;
		short num2 = 12345;
		int num3 = 987654321;
		long num4 = 987_6543_21; // we can add underscore after java 7

		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);

		long minValue = Byte.MIN_VALUE;
		int maxValue = Integer.MAX_VALUE;

		System.out.println(minValue + " " + maxValue);

		BigDecimal firstNum = new BigDecimal("0.32"); // use BigDecimal class while you want to get exact answer
		BigDecimal secNum = new BigDecimal("0.03");

		System.out.println(firstNum.add(secNum));

		char degree = 65;

		System.out.println("Printing char using ASCII value " + degree);

		boolean international = true;
		double fees = 24000.0d;
		double intFees = 2000d;

		if (international) {
			fees = fees + intFees;
			System.out.println("Fees is " + fees);
		}

	}
}

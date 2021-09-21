package com.logilite.datatype;

import java.math.BigDecimal;

public class DatatypeRange {

	byte by = 18;
	short sh = 122;
	int in = 1000;
	long lo = 99_222_1011L;
	float fl =1.2f;
	double dl = 1.2222222222222222;
	char ch = '\u0000';
	char cha = '\u0044';

	byte _byteMinValue_ = Byte.MIN_VALUE;
	byte _byteMaxvalue_ = Byte.MAX_VALUE;

	long $longMinValue$ = Long.MIN_VALUE;
	long $longMaxValue$ = Long.MAX_VALUE;

	public void show() {
		System.out.println("ByteMinValue :- " + _byteMinValue_);
		System.out.println("ByteMaxvalue :- " + _byteMaxvalue_);
		System.out.println("\nlongMinValue :- " + $longMinValue$);
		System.out.println("longMaxValue :- " + $longMaxValue$);
		System.out.println("\n.....Values Print.....");
		System.out.println("byte :- " + by);
		System.out.println("short :- " + sh);
		System.out.println("int :- " + in);
		System.out.println("long :- " + lo);
		System.out.println("float :- " + fl);
		System.out.println("double :- " + dl);
		System.out.println("char by unicode :- " + ch+","+cha);

	}

	static void primitive() {
		System.out.println("\nYou are in static block");

		int hexa = 0x00254;
		System.out.println("Hexanumber convert :- " + hexa);

		int binary = 0b001101;
		System.out.println("Binary  covert :- " + binary);

		System.out.println("Static Block over");
	}

	public static void main(String[] args) {

		DatatypeRange dr = new DatatypeRange();
		dr.show();
		primitive();
		BigDecimal number_1 = new BigDecimal("2.5");
		BigDecimal number_2 = new BigDecimal("4.3");
		BigDecimal number_3 = new BigDecimal("1.8");
		
		System.out.println("Today's working hours count using Bigdecimal  :-"+ number_1.add(number_2).add(number_3));
	}

}

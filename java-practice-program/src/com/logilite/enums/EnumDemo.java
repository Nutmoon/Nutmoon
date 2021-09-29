package com.logilite.enums;

public enum EnumDemo {

	WIPRO(8), ORACAL(4), TCS(7), LOGILITE(10), INFOSYS(2);

	private EnumDemo(int position) {
		this.position = position;
	}

	private int position;

	public int getPosition() {
		return position;
	}
	
	public static void main(String[] args) {
		for (EnumDemo enumValues : EnumDemo.values()) {
			 System.out.print("\nName: " + enumValues); //toString
	            System.out.print(",  name(): " + enumValues.name());
	            System.out.print(",  Ordinal: " + enumValues.ordinal());
	            System.out.print(",  Declaring Class: " + enumValues.getDeclaringClass().toString());	
	            System.out.print(",  compareTo(Oracal): " + enumValues.compareTo(enumValues.ORACAL));
	            System.out.print(",  equals(Oracal): " + enumValues.equals(enumValues.ORACAL));
	            System.out.print(",  position: " + enumValues.getPosition()+"\n");
		}
	}

}

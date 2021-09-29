package com.logilite.enum1;

import com.logilite.enum1.DrinkEnumExample.DrinkTypeInterface;

//create enum class and implement interface foe method Defination
public enum DrinkType implements DrinkTypeInterface {

	// all enum with value
	COFFEE("Coffee"), TEA("Tea"), WISKY("Wisky"), JUICE("Juice"), COLDDRINK("ButteMilk");

	private final String type;

	// Constructor of DrinkType And Get Value of drink type
	private DrinkType(final String type) {
		this.type = type;
	}

	// METHOD display typeof drink
	public String getDisplayableType() {
		return type;
	}
}
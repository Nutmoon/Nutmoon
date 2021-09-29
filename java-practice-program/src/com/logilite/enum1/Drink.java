package com.logilite.enum1;

import com.logilite.enum1.DrinkEnumExample.DrinkTypeInterface;

//create enum class and implement interface foe method Defination
public enum Drink implements DrinkTypeInterface {

	// all enum with value
	INDIAN("Indian Drink", DrinkType.TEA), USA("USA Drink", DrinkType.WISKY), CANADA("Canada Drink", DrinkType.JUICE),
	GUJRAT("Gujrat Drink", DrinkType.COLDDRINK);

	private final String label;
	private final DrinkType type;

	// Constructor of Drink And Get Value of origin And drink type
	private Drink(String label, DrinkType type) {
		this.label = label;
		this.type = type;
	}

	public String getDisplayableType() {
		return type.getDisplayableType();
	}

	// method display drink Origin
	public String getLabel() {
		return label;
	}
}

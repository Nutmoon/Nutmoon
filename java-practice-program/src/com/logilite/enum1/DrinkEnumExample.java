package com.logilite.enum1;

//Drink Example Use Of Enum
public final class DrinkEnumExample {

	// create One InterFace And GetData And Display
	public interface DrinkTypeInterface {

		String getDisplayableType();
	}

	public static void main(String[] args) {
		int num = 1;
		int no = 1;
		// iterate And show data of type of Drinks from the enum Drinkclass
		System.out.println("\n.....All drink types.....\n");
		for (DrinkType type : DrinkType.values()) {
			System.out.print(num + ")");
			displayType(type);
			num++;
			System.out.println();
		}

		// iterate And show data of Drinks and origin from the enum DrinkTypeclass
		System.out.println("\n....All drinks....\n");
		for (Drink drink : Drink.values()) {
			System.out.print(no + ")");
			displayDrink(drink);
			no++;
			System.out.println();
		}
	}

	// iterator in use method that display data of Drink Class
	private static void displayDrink(Drink drink) {

		displayType(drink);
		System.out.print(" - ");
		System.out.print(drink.getLabel());
	}

	// iterator in use method that display data of Interface DrinkTypeInterface
	private static void displayType(DrinkTypeInterface displayable) {
		System.out.print(displayable.getDisplayableType());
	}
}

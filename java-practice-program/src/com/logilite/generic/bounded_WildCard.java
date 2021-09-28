package com.logilite.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class bounded_WildCard {
	// intialize WildCard And Printing Data
	public static void printAll(List<?> list) {
		for (Object item : list)
			System.out.println(item + " ");
	}

	// Producer ;- Exteds
	// Consumer :- Super
	// upperBounded demo
	private static double sum(List<? extends Number> list) {
		double sum = 0.0;
		for (Number i : list) {
			sum += i.doubleValue();
		}

		return sum;
	}

	// Lower Bounded Demo
	private static void sampleMethod(Collection<? super Integer> col) {
		Iterator it = col.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("");
	}

	public static void main(String args[]) {
		// Use Integer Type
		List<Integer> integerList = Arrays.asList(1, 2, 3);
		System.out.println("Integer Number :- ");
		printAll(integerList);

		// Use Double Type
		List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5, 25.00, 9.3);
		System.out.println("Double Number :- ");
		printAll(doubleList);

		// Double list upper bounded
		List<Double> list2 = Arrays.asList(1.2, 2.3, 3.5, 25.00, 9.3);
		System.out.print("Total sum is:" + sum(list2));

		// Lowe Bounded Demo
		ArrayList<Integer> col1 = new ArrayList<Integer>();
		col1.add(24);
		col1.add(56);
		col1.add(89);
		col1.add(75);
		col1.add(36);
		System.out.println("\n\nValues Print By Lower Bounded");
		sampleMethod(col1);
		List<Object> col2 = Arrays.asList(22.1f, 3.32f, 51.4f, 82.7f, 95.4f, 625.f);
		sampleMethod(col2);
	}

}

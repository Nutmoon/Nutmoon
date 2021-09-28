package com.logilite.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionClass_Demo {

	public static void main(String[] args) {

		// List Interface
		List<String> list = new ArrayList<>();
		list.add("Darshan");
		list.add("Hardik");
		list.add("Piyush");

		String[] array = { "Chintan", "Amit", "Satyam", "Mayank", "Arpan" };

		// Add Data In collection And Print
		Collections.addAll(list, array);
		System.out.println("\nlist: " + list);

		// SORTNIG OF LIST And Print
		Collections.sort(list);
		System.out.println("\nSorted list: " + list);

		// Binary Serching To check In List
		System.out.println("\nIs Drashan There? : " + Collections.binarySearch(list, "Darshan"));

		// Print In reverse Order
		Collections.reverse(list);
		System.out.println("\nReverse list: " + list);

		// Swap O And 3 Element
		Collections.swap(list, 0, 3);
		System.out.println("\nAfter swapping: " + list);

		// check Frequncy Of element
		System.out.println("\n# Piyush's: " + Collections.frequency(list, "Piyush"));

		// Shffle to list means random
		Collections.shuffle(list);
		System.out.println("\nShuffled list: " + list);

		// Max and min value show
		System.out.println("\nMax: " + Collections.max(list));
		System.out.println("\nMin: " + Collections.min(list));

		// remove From the list
		list.removeAll(Collections.singleton("Amit"));

		// Unmodifiable View ~ to provide clients with read-only access to internal
		Collection<String> unmodifiable = Collections.unmodifiableCollection(list);
		System.out.println("\nunmodifiable: " + unmodifiable);
		System.out.println("\nIs Arpan there?: " + unmodifiable.contains("Arpan"));
		list.add("Amit");
		System.out.println("\nunmodifiable 2: " + unmodifiable);

	}

}

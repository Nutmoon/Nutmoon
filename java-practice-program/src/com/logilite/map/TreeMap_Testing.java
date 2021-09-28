package com.logilite.map;

import java.util.*;

public class TreeMap_Testing {
	public static void main(String[] args) {
		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
		// Mapping string values to int keys
		tree_map.put(22, "Oracal");
		tree_map.put(11, "Wipro");
		tree_map.put(33, "Logilite");
		tree_map.put(55, "TCS");
		tree_map.put(01, "MicroSoft Corporation");

		// Display In sorting order Automatic
		for (Map.Entry m : tree_map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// Dispaly in Decending Order
		System.out.println("\ndescendingMap: " + tree_map.descendingMap());

		// Returns key-value pairs whose keys are less than or equal to the specified
		System.out.println("\nheadMap: " + tree_map.headMap(11, true));

		// Returns key-value pairs whose keys are greater than or equal to the specified
		System.out.println("\ntailMap: " + tree_map.tailMap(33, true));

		// Returns key-value pairs exists in between the specified key.
		System.out.println("\nsubMap: " + tree_map.subMap(11, false, 33, true));

		// remove frome the key
		tree_map.remove(11);
		System.out.println("\nAfter Removing : " + tree_map);

		// Change Value From The key
		tree_map.put(01, "Logilite");
		tree_map.put(33, "MicroSoft Corporation");
		System.out.println("\nAfter Change Value o f Key O1 aND 33 : " +  tree_map);
		

	}
}
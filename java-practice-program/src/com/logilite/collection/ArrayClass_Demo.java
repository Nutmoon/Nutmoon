package com.logilite.collection;

import java.util.Arrays;

public class ArrayClass_Demo {
	public static void main(String[] args) {

		// First Array
		int intArr[] = { 10, 20, 15, 22, 35, 50, 100, 001 };

		// Sorting The Arry
		Arrays.sort(intArr);
		int intKey = 22;
		// To sort the array using normal sort
		Arrays.sort(intArr, 1, 3);
		System.out.println("Integer Array(Sortng 1To 3 index): " + Arrays.toString(intArr));

		// Use Binary Serching And Print the key and corresponding index
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));

		// Second Array
		int intArr1[] = { 10, 15, 22 };

		// To compare both arrays
		System.out.println("Integer Arrays on comparison: " + Arrays.compare(intArr, intArr1));

		// To compare both arrays
		System.out.println("Integer Arrays on comparison: " + Arrays.equals(intArr, intArr1));

		// To compare both arrays
		System.out.println("The element mismatched at index: " + Arrays.mismatch(intArr, intArr1));

		// To print the elements in one line
		System.out.println("Integer Array : " + Arrays.toString(intArr));
		System.out.println("\nNew Arrays by copyOf:\n");
		System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOf(intArr, 10)));

		// To get the dep hashCode of the arrays
		System.out.println("Integer Array (HashCode	): " + Arrays.hashCode(intArr));

		// To sort the array using parallelSort
		Arrays.parallelSort(intArr);
		System.out.println("Integer Array(Parallel sorting): " + Arrays.toString(intArr));

		// To fill the arrays
		Arrays.fill(intArr, intKey);
		System.out.println("Integer Array on filling: " + Arrays.toString(intArr));
	}

}

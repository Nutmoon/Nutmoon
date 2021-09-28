package com.logilite.generic;

import java.util.Arrays;
import java.util.List;

public class Unbounded_WildCard {
	// intialize WildCard And Printing Data
	public static void printAll(List<?> list) {
		for (Object item : list)
			System.out.println(item + " ");
	}
	
	private static double sum(List<? extends Number> list) 
    {
        double sum=0.0;
        for (Number i: list)
        {
            sum+=i.doubleValue();
        }
  
        return sum;
    }

	public static void main(String args[]) {
		// Use Integer Type
		List<Integer> integerList = Arrays.asList(1, 2, 3);
		System.out.println("Integer Number :- ");
		printAll(integerList);

		// Use Double Type
		List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5,25.00,9.3);
		System.out.println("Double Number :- ");
		printAll(doubleList);

		// Double list
		List<Double> list2 = Arrays.asList(1.2, 2.3, 3.5,25.00,9.3);
		System.out.print("Total sum is:" + sum(list2));
	}

	
}

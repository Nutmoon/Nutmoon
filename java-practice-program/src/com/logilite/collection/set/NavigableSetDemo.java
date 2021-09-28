package com.logilite.collection.set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	private static void treeSetDemo2() {
		NavigableSet<Integer> set = new TreeSet<>();
		set.add(5);
		set.add(23);
		set.add(74);
		set.add(99);
		set.add(1);
		set.add(11);
		set.add(111);
		// show first lower value given number
		System.out.println("lower: " + set.lower(5));
		// show first lower value giv3en number
		System.out.println("floor: " + set.floor(74));
		// show Higher value given number
		System.out.println("ceiling: " + set.ceiling(111));
		// show Higher value given number
		System.out.println("higher: " + set.higher(99));
		// show First value lower
		System.out.println("first: " + set.first());
		// show last value max
		System.out.println("last: " + set.last());

		System.out.println("set: " + set);

		NavigableSet<Integer> descendingSet = set.descendingSet();
		System.out.println("descendingSet: " + descendingSet);

		NavigableSet<Integer> headSet = set.headSet(74, true);
		System.out.println("headSet: " + headSet);

		headSet.add(6);
		System.out.println("headSet: " + headSet);
		System.out.println("set: " + set);
		headSet.add(4);
		System.out.println("set: " + set);

		SortedSet<Integer> subSet = set.subSet(23, 111);

		// Adding element in backed set (original set) and
		set.add(25);
		System.out.println("subSet: " + subSet);
	}

	public static void main(String[] args) {
		treeSetDemo2();
	}
}

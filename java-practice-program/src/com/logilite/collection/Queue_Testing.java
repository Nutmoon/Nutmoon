package com.logilite.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_Testing{
	
	private static void dequeTest() {
		// Queue - FIFO
		Deque<String> deque = new ArrayDeque<>();
		deque.add("Logilite");
		deque.add("Is ");
		deque.add("Best");
		
		System.out.println("\nPrinting Queue ...");
		System.out.println(deque.remove()); // removeFirst
		System.out.println(deque.remove());
		System.out.println(deque.remove());
		
		// Stack - LIFO
		deque.push("Logilite");
		deque.push("Is");
		deque.push("Best");
		
		System.out.println("\nPrinting Stack ...");
		System.out.println(deque.pop()); 
		System.out.println(deque.pop());
		System.out.println(deque.pop());
	}
	
	public static void main(String[] args) {
		dequeTest();
	}
	
}

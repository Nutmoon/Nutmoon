package com.logilite.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo {
	private static void hashMapDemo() {
		System.out.println("\nInside hashMapDemo ...");
		Map<String, Integer> map1 = new HashMap<>();
		//add key and value in map
		map1.put("Darshan", 21);
		map1.put("Hardik", 28);
		map1.put("Piyush", null);
		map1.put("Chintan", 30);	
		map1.put("Amit", 130);
		//add  value overwrite in map
		map1.put("Piyush", 26);
		System.out.println(map1);
		//contains check value available or not
		System.out.println("Contains Piyush? " + map1.containsKey("Piyush"));
		System.out.println("Chintann's age: " + map1.get("Chintan"));
		//Show data Iterating using keySet ...
		System.out.println("\nIterating using keySet ...");
		Set<String> names = map1.keySet();
		for (String name : names) {
			System.out.println("Name: " + name + ", Age: " + map1.get(name));
		}
		//Show data Iterating using entrySet ...
		System.out.println("\nIterating using entrySet ...");
		Set<Map.Entry<String, Integer>> mappings = map1.entrySet();
		for (Map.Entry<String, Integer> mapping : mappings) {
			System.out.println("Name: " + mapping.getKey() + ", Age: " + mapping.getValue());
		}
		//remove data using key and print
		names.remove("Amit");
		System.out.println(map1);
		
		//Add new object value in the map
		Map<String, Map<String, Object>> userProfile = new HashMap<>();
		
		Map<String, Object> profile = new HashMap<>();
		profile.put("age", 25);
		profile.put("dept", "CS");
		profile.put("city", "New York");
		
		userProfile.put("Piyush", profile);
		
		profile = new HashMap<>();
		profile.put("age", 29);
		profile.put("dept", "CS");
		profile.put("city", "New York");
		
		userProfile.put("Hardik", profile);
		//print user profiles
		System.out.println("userProfile: " + userProfile);
		// print age on the name or key
		Map<String, Object> profile1 = userProfile.get("Piyush");
		int age = (Integer) profile1.get("age");
		System.out.println("Age: " + age);
		
	}
		
	public static void main(String[] args) {
		hashMapDemo();		
	}	
}

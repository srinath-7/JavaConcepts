package com.sri.Map;

import java.util.LinkedHashMap;

//Insertion order is preserved
public class LinkedHashMapDemo {

	public static void main(String args[]) {

		LinkedHashMap m = new LinkedHashMap();
		m.put("Chiru", 700);
		m.put("balaiah", 800);
		m.put("Venky", 200);
		m.put("nagarjuna", 500);

		System.out.println(m);
	}

}

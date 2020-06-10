package com.sri.MyComparator;

import java.util.TreeSet;

public class Main {

	public static void main(String args[]) {
		// Customised sorting order
		TreeSet Demo1 = new TreeSet(new Demo());
		// Mycomparator class
//		Demo.add(25);
//		Demo.add(20);
//		Demo.add(40);
//		Demo.add(1);
//		Demo.add(0);
//		Demo.add(10);

		// TreesetDemo.class
		Demo1.add("Roja");
		Demo1.add("ShobhaRani");
		Demo1.add("Rajakumari");
		Demo1.add("GangaBhavani");
		Demo1.add("Ramulamma");

		System.out.println(Demo1);
	}

}

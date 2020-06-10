package com.sri.List;

import java.util.LinkedList;

public class LinkedDemo {

	public static void main(String args[]) {

		LinkedList l = new LinkedList();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		l.set(0, "software");
		System.out.println(l);
		l.set(0, "venky");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("CCC");
		System.out.println(l);

	}

}

package com.sri.MyComparator;

import java.util.TreeSet;

public class BufferDemo {

	public static void main(String args[]) {

		TreeSet set = new TreeSet(new MyComparatorDemo());
		set.add(new StringBuffer("A"));
		set.add(new StringBuffer("Z"));
		set.add(new StringBuffer("K"));
		set.add(new StringBuffer("S"));

		System.out.println(set);

	}

}

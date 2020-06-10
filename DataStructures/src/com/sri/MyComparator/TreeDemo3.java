package com.sri.MyComparator;

import java.util.TreeSet;

// This class is used for the comparasion of the both homogeneous and hetergeneous
public class TreeDemo3 {

	public static void main(String args[]) {

		TreeSet Dem = new TreeSet(new MyComparatorDemo());
		Dem.add("A");
		Dem.add(new StringBuffer("ABC"));
		Dem.add(new StringBuffer("AA"));
		Dem.add("XX");
		Dem.add("ABCD");
		Dem.add("A");
		System.out.println(Dem);
	}

}

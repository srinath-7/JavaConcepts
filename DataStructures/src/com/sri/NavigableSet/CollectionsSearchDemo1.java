package com.sri.NavigableSet;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchDemo1 {

	public static void main(String args[]) {

		ArrayList list = new ArrayList();
		list.add("d");
		list.add("c");
		list.add("g");
		list.add("f");
		list.add("a");

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, "g"));
		System.out.println(Collections.binarySearch(list, "h"));

	}

}

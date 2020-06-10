package com.sri.NavigableSet;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSearchDemo {

	public static void main(String args[]) {

		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add(20);
		list1.add(60);
		list1.add(85);
		list1.add(40);
		list1.add(0);

		System.out.println(list1);
//		Collections.sort(list1);
		Collections.sort(list1, new MyComp());
		System.out.println(list1);
		System.out.println(Collections.binarySearch(list1, 85, new MyComp()));
		System.out.println(Collections.binarySearch(list1, 55, new MyComp()));
		// Unpredicate result
		System.out.println(Collections.binarySearch(list1, 18));

	}

}

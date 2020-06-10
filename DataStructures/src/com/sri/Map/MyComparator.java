package com.sri.Map;

import java.util.Comparator;

//TreeMapDemo 
public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub

		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}

}
